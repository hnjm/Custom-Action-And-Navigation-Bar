# Custom Navigation Bar and Action Bar

##Custom Action Bar :
When you want to customize action bar all you have to do in **app_bar_main.xml** 
There you will find **AppBarLayout** Which will contain a **toolbar** layout but you have to remove all of those and have to set **AppBarLayout** layout_height to **?actionBarSize**
Then the **AppBarLayout** will take actionbar standard size .

###Example Code:

```
    <com.google.android.material.appbar.AppBarLayout
        app:elevation="0dp"
        android:layout_width="match_parent"
        android:layout_height="?actionBarSize"
        android:theme="@style/AppTheme.AppBarOverlay">
        
    </com.google.android.material.appbar.AppBarLayout>     
        
```

Then Setup your layout inside The **AppBarLayout** As Follows (Full Code):
```
    <com.google.android.material.appbar.AppBarLayout
        app:elevation="0dp"
        android:layout_width="match_parent"
        android:layout_height="?actionBarSize"
        android:theme="@style/AppTheme.AppBarOverlay">

        <LinearLayout
            android:orientation="horizontal"
            android:background="@color/colorAccent"
            android:layout_width="match_parent"
            android:layout_height="?actionBarSize" >
            <ImageView
                android:id="@+id/drawer_logo"
                android:layout_marginLeft="15dp"
                android:src="@drawable/ic_baseline_notes_24"
                android:layout_width="25dp"
                android:layout_height="?actionBarSize"/>
            <RelativeLayout
                android:orientation="horizontal"
                android:layout_margin="10dp"
                android:layout_gravity="center_vertical"
                android:background="@drawable/action_bar_search_back"
                android:layout_width="match_parent"
                android:layout_height="match_parent">
                <TextView
                    android:layout_centerVertical="true"
                    android:textColor="@color/gray_text_color"
                    android:layout_marginLeft="20dp"
                    android:textSize="12sp"
                    android:text="@string/search_text"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"/>
                <ImageView
                    android:layout_centerVertical="true"
                    android:layout_marginRight="10dp"
                    android:layout_alignParentRight="true"
                    android:src="@drawable/ic_baseline_search_24"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"/>
            </RelativeLayout>

        </LinearLayout>


    </com.google.android.material.appbar.AppBarLayout>
```

There you will make your View of custom navigation bar . But now you have to set on click listener to the icon in actionbar as Follows :

