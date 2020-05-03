package it.csdev.mapper;

public interface Mapper<From,To> {
    To map(From from);
}
