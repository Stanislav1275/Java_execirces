package ru.sstu.cocktail.sixHead.Stock;

import java.util.*;

public class Stocker implements Observer{
    private Map<String, List<String>> stocksNews = new HashMap<>();
    public final String name;

    public Stocker(String name) {
        this.name = name;
    }
    @Override
    public void update(String stockName, String news) {
        if(stocksNews.containsKey(stockName)){
            stocksNews.get(stockName).add(news);
        }else stocksNews.put(stockName, new ArrayList<>(Collections.singletonList(news)));
        System.out.println(name + " - "  + news);
    }
    public void  displayNews(){
        System.out.println(stocksNews);
    }
    public void subscribe(Stock stock){
        if(stocksNews.containsKey(stock.getName())){
            System.out.println("вы уже подписаны");
        }
        else {
            stocksNews.put(stock.getName(), new ArrayList<>(Collections.singletonList(stock.name + " : " + stock.getPrice())));
        }
        stock.addObserver(this);
    }

}
