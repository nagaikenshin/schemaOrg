package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PROCESSING_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.ProcessingTime;

@ExternalDomain
public class ProcessingTimeConverter implements DomainConverter<ProcessingTime, String> {

	@Override
	public String fromDomainToValue(ProcessingTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProcessingTime fromValueToDomain(String value) {
		return new PROCESSING_TIME(value);
	}

}
