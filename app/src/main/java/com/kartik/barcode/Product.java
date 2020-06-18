package com.kartik.barcode;

/**
 * Created by Kartik on 11-07-2016.
 */
public class Product
{
   public String Barcode;
   public String Pname;
   public String Date;
   public  String Time;
   public String Discription;

    public Product()
    {

    }

    public Product(String Barcode ,String Pname,String Date,String Time,String Discription)
    {
        this.Barcode=Barcode;
        this.Pname=Pname;
        this.Date=Date;
        this.Time=Time;
        this.Discription=Discription;
    }

   /* public String getBarcode() {
        return Barcode;
    }

    public String getPname() {
        return Pname;
    }

    public String getDate() {
        return Date;
    }

    public String getTime() {
        return Time;
    }

    public String getDiscription() {
        return Discription;
    }*/
}