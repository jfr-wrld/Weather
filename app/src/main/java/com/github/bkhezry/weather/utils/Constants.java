package com.github.bkhezry.weather.utils;

public class Constants {
  public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";
  public static final String UNITS = "metric";
  public static final String[] DAYS_OF_WEEK = {
      "Minggu",
      "Senin",
      "Selasa",
      "Rabu",
      "Kamis",
      "Jumat",
      "Sabtu"
  };
  public static final String[] MONTH_NAME = {
      "Januari",
      "Februari",
      "Maret",
      "April",
      "Mei",
      "Juni",
      "Juli",
      "Agustus",
      "September",
      "Oktober",
      "November",
      "Desember"
  };

  public static final String[] DAYS_OF_WEEK_PERSIAN = {
      "یکشنبه",
      "دوشنبه",
      "سه‌شنبه",
      "چهارشنبه",
      "پنج‌شنبه",
      "جمعه",
      "شنبه"
  };
  public static final String[] MONTH_NAME_PERSIAN = {
      "فروردین",
      "اردیبهشت",
      "خرداد",
      "تیر",
      "مرداد",
      "شهریور",
      "مهر",
      "آبان",
      "آذر",
      "دی",
      "بهمن",
      "اسفند"
  };

  public static final String[] WEATHER_STATUS = {
      "Hujan badai",
      "Gerimis",
      "Hujan",
      "Salju",
      "Suasana",
      "Cerah",
      "Sedikit Awan",
      "Awan Pecah",
      "Berawan"
  };

  public static final String[] WEATHER_STATUS_PERSIAN = {
      "رعد و برق",
      "نمنم باران",
      "باران",
      "برف",
      "جو ناپایدار",
      "صاف",
      "کمی ابری",
      "ابرهای پراکنده",
      "ابری"

  };


  public static final String CITY_INFO = "city-info";

  public static final long TIME_TO_PASS = 6 * 600000;

  public static final String LAST_STORED_CURRENT = "last-stored-current";
  public static final String LAST_STORED_MULTIPLE_DAYS = "last-stored-multiple-days";
  public static final String OPEN_WEATHER_MAP_WEBSITE = "https://home.openweathermap.org/api_keys";

  public static final String API_KEY = "api-key";
  public static final String LANGUAGE = "language";
  public static final String DARK_THEME = "dark-theme";
  public static final String FIVE_DAY_WEATHER_ITEM = "five-day-weather-item";
}
