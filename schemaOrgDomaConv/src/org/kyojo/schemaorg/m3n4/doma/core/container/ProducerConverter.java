package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PRODUCER;
import org.kyojo.schemaorg.m3n4.core.Container.Producer;

@ExternalDomain
public class ProducerConverter implements DomainConverter<Producer, String> {

	@Override
	public String fromDomainToValue(Producer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Producer fromValueToDomain(String value) {
		return new PRODUCER(value);
	}

}
