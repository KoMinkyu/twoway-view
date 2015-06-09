package org.lucasr.twowayview.sample;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by minkyu on 2015. 6. 9..
 */
public class ParcelableInteger implements Parcelable {

  public int value;

  public ParcelableInteger(int value) {
    this.value = value;
  }

  public ParcelableInteger(Parcel source) {
    value = source.readInt();
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(value);
  }

  public static final Creator Creator = new Creator() {
    @Override
    public ParcelableInteger createFromParcel(Parcel source) {
      return new ParcelableInteger(source);
    }

    @Override
    public ParcelableInteger[] newArray(int size) {
      return new ParcelableInteger[size];
    }
  };
}
