package data;

import android.provider.BaseColumns;

public final class PetContract {

    void PetContract(){
    }

    public static final class PetEntry implements BaseColumns{

        public static final String TABLE_NAME = "Pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_NAME = "name";
        public static final String CULUMN_BREED = "breed";
        public static final String COLUMN_GENDER = "gender";
        public  static final String COLUMB_WEIGHT = "weight";

        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKNOWN = 0;
    }
}
