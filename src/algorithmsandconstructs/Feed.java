/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author apont
 */
public class Feed implements FeedInterface{
    
    ArrayList<FeedItem> items;
    
    public Feed(){
        items = new ArrayList<>();
    }

    @Override
    public void addItem(FeedItem item) {
        this.items.add(item);
    }

    @Override
    public Collection<String> listTitles() {
        
        ArrayList<String> titles = new ArrayList<>();
        
        for (FeedItem item : items){
            titles.add(item.getTitle());
        }
        
        return titles;
    }

    @Override
    public FeedItem getItem(String title) {
        for(FeedItem item : items){
            if(item.getTitle().equalsIgnoreCase(title)){
                return item;
            }
        }
        return null;
    }

    @Override
    public int numItems() {
        return items.size();
    }

    @Override
    public Collection<FeedItem> findItems(String keyword) {
        
        ArrayList<FeedItem> foundItems = new ArrayList<>();
        
        for(FeedItem item : items){
            if(item.getTitle().toLowerCase().contains(keyword) || item.getContent().toLowerCase().contains(keyword)){
                foundItems.add(item);
            }
        }
        
        return foundItems;
        
    }
    
}
