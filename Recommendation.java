package algorithm;

import java.util.List;

import entity.Item;

public interface Recommendation {
  public List<Item> recommendItems(String uId, double lat, double longt);
  public void testMethod(String s);
}
