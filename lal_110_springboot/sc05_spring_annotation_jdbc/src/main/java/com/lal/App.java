package com.lal;

import com.lal.modal.Item;
import com.lal.services.StoreInventory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(SpringConfigs.class);
        StoreInventory storeInventory = (StoreInventory) beanFactory.getBean(StoreInventory.class);
        List<Item> items = storeInventory.findAllInventory();
        items.forEach(item -> System.out.format("%d, %s, %.2f\n", item.getId(), item.getName(), item.getPrice()));
    }
}
