package com.atilano.atilanoquiz1;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import static com.atilano.atilanoquiz1.R.array.codename;
import static com.atilano.atilanoquiz1.R.layout.list_versions;

/**
 * Created by Jeanina on 28 Sep 2017.
 */

public class ListActivity extends android.app.ListActivity{

    String[] codename;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(list_versions);

        codename = getResources().getStringArray(codename);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, codename);
        setListAdapter(adapter);
    }
}
