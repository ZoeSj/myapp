package com.example.wework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.wework.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ItemImg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eat);
        
        ListView listview=(ListView) findViewById(R.id.listView1);
        int[] imageId=new int[]{R.drawable.eat_img1,R.drawable.eat_img2,R.drawable.eat_img03,R.drawable.eat_img4,R.drawable.eat_img5,R.drawable.eat_img6};
        String[] title=new String[]{"海洋餐厅","诸葛烤鱼","采蝶轩","芒不颠港式甜品","麦当老","戴林娜法国餐厅"};
        List<Map<String,Object>>listItems=new ArrayList<Map<String,Object>>();
        for(int i=0;i<imageId.length;i++){
        	Map<String,Object>map=new HashMap<String,Object>();
        	map.put("image",imageId[i]);
        	map.put("title",title[i]);
        	listItems.add(map);
        }
        SimpleAdapter adapter=new  SimpleAdapter(this,listItems,R.layout.items,new String[] {"title","image"},new int[]{R.id.title,R.id.image});
        listview.setAdapter(adapter);
    }
}

