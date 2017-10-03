package com.geeconsystems.globalhr.CustomCells;

/**
 * Created by Asus on 10/3/2017.
 */

public class recycler_list
{

    private String Name,myname,myphno;
    private Integer phno;
    public recycler_list(String title,String name,String Myphno,Integer Phno)
    {
        Name = title;
        myname=name;
        myphno=Myphno;
        phno=Phno;
    }

    public String getTitle()
    {
        return Name;
    }

    public String getname(){

        return myname;
    }
    public String getMyphno(){

        return myphno;
    }
    public Integer getPhno(){
        return phno;
    }
}
