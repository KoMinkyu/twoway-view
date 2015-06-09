package org.lucasr.twowayview.sample;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by minkyu on 2015. 6. 9..
 */
public class StateSavingRecyclerAdapter<T extends Parcelable> extends RecyclerView.Adapter {
  private static final String KEY_ADAPTER_SAVED_INSTANCE = StateSavingRecyclerAdapter.class.getSimpleName() +
                                                  "KEY_ADAPTER_STATE";

  ArrayList<T> items = new ArrayList<>();

  public void onSaveInstanceState(Bundle outState) {
      outState.putParcelableArrayList(KEY_ADAPTER_SAVED_INSTANCE, items);
  }

  public void onRestoreInstanceState(Bundle savedInstanceState) {
      if (savedInstanceState.containsKey(KEY_ADAPTER_SAVED_INSTANCE)) {
          ArrayList<T> restoredObjects = savedInstanceState.getParcelableArrayList(KEY_ADAPTER_SAVED_INSTANCE);
          items.clear();
          items.addAll(restoredObjects);
      }
  }

  @Override
  public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      return null;
  }

  @Override
  public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {}

  @Override
  public int getItemCount() {
      return 0;
  }
}
