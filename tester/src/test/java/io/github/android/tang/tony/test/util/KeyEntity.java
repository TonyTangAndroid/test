package io.github.android.tang.tony.test.util;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.annotations.SerializedName;
import com.ryanharter.auto.value.gson.GenerateTypeAdapter;

@AutoValue
@GenerateTypeAdapter
public abstract class KeyEntity {

  @SerializedName("id")
  public abstract String uuid();

  @Nullable
  @SerializedName("name")
  public abstract String name();

  public static KeyEntity create(String uuid, String name) {
    return new AutoValue_KeyEntity(uuid, name);
  }
}
