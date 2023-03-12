package lesson021;

public enum EErrorType {
	
	OUT_OF_BOUNDS ("Sınırların dışında yük verildi", 1001),
	SEAT_ALREADY_OCCPUIED ("Seçilen yer dolu", 1002),
	LIGHT_WEIGHT ("100 KG.den hafif yük yüklenemez", 1003),
	OUT_OF_SHIFT_DAY ("Cuma günleri yük kabul edilmiyor" , 1004),
	PAST_DATE ("Geçmiş bir tarih girilemez", 1005);
	
	private String message;
	private int code;
	
	private EErrorType() {
		
	}
		
	private EErrorType(String message, int code) {
		this.message = message;
		this.code = code;
	}


	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}
	
}
