package exceptions

class InvalidValueException(value: Double): RuntimeException("Value $value is not valid")