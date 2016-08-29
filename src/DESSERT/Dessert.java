package DESSERT;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lukasz.homik on 2016-08-29.
 */
public interface Dessert {
    @Autowired
    public void setDessert(Dessert dessert);
}
