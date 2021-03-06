package com.cspcode.utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectUtils {

  private static final Gson GSON = new GsonBuilder().serializeNulls().setPrettyPrinting().create();

  private ObjectUtils() {
    throw new UnsupportedOperationException("Instantiation of this class is not permitted in case you are using reflection.");
  }

  /**
   * This method is responsible for de-serializing the Java Object into Json String.
   *
   * @param object Object to be de-serialized.
   * @return String
   */
  public static String deserializeObjectToString(final Object object) {
    return GSON.toJson(object);
  }
}
