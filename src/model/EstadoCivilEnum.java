package model;

public enum EstadoCivilEnum {
	
	Solteiro(0), Casado(1), Viuvo(2);

	private Integer value;

	private EstadoCivilEnum(Integer value) {
		this.value = value;
	}

	public static EstadoCivilEnum fromInt(Integer value) {
		if (value == null) {
			return null;
		}

		switch (value) {
		case 0:
			return Solteiro;
		case 1:
			return Casado;
		case 2:
			return Viuvo;
		default:
			return null;
		}
	}

	public Integer toInt() {
		return value;
	}

	@Override
	public String toString() {
		switch (this) {
		case Solteiro:
			return "Solteiro";
		case Casado:
			return "Casado";
		case Viuvo:
			return "Viuvo";
		default:
			return "";
		}
	}
}
