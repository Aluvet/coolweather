package com.example.weatherforecast.DB;

import android.widget.Toast;

import com.example.weatherforecast.Fragment.ChooseAreaFragment;

import org.litepal.crud.LitePalSupport;

import java.util.concurrent.ThreadPoolExecutor;

import okhttp3.internal.NamedRunnable;

public class County extends LitePalSupport {


        private int id;
        private String countyName;
        private String weatherId;
        private int cityId;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCountyName() {
            return countyName;
        }

        public void setCountyName(String countyName) {
            this.countyName = countyName;
        }

        public String getWeatherId() {
            return weatherId;
        }

        public void setWeatherId(String weatherId) {
            this.weatherId = weatherId;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }
    }

