import java.security.GeneralSecurityException;
import java.util.Optional;
class ErrorHandling {
    void handleErrorByThrowingIllegalArgumentException() {
        throw new IllegalArgumentException();
    }
    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException("This is the detail message.");
    }
    void handleErrorByThrowingAnyCheckedException() throws GeneralSecurityException {
        throw new GeneralSecurityException();
    }
    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws GeneralSecurityException {
        throw new GeneralSecurityException(message);
    }
    void handleErrorByThrowingAnyUncheckedException() {
        throw new RuntimeException();
    }
    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new RuntimeException(message);
    }
    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }
    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message)  throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }
    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }
    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }
    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        try {
          return Optional.of(Integer.valueOf(integer));
        } catch (NumberFormatException e) {
          return Optional.empty();
        }
    }
}
    