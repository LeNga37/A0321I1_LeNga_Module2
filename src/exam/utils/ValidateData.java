package exam.utils;

public class ValidateData {
        private static final String ID_BENHAN_REGEX = "^(BA)-\\\\d{3}$";
        private static final String ID_BENHNHAN_REGEX = "^(BN)-\\\\d{3}$";
        private static final String ID_NAME_REGEX = "^(([A-Z][a-z]+)(| ))+$";;
        private static final String BIRTHDAY_REGEX = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        private static final String USABLE_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
        private static final String POOL_AREA_REGEX = "([3-9]\\d|[1-9]\\d{2,})$";
}
