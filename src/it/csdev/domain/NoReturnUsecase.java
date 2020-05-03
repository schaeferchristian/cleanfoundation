package it.csdev.domain;

public interface NoReturnUsecase<In> {
    void execute(In input);
}
