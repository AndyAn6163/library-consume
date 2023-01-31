package cub.book.deserializer;

import cub.book.entity.LogEntity;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class LogEntityDeserializer extends ObjectMapperDeserializer<LogEntity> {

	public LogEntityDeserializer() {
		super(LogEntity.class);
	}
}