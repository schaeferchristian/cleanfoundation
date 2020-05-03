package it.csdev.domain;

public interface Usecase<In,Out> {
    Out execute(In input);
}
