package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RECORDED_AT;
import org.kyojo.schemaorg.m3n4.core.Container.RecordedAt;

@ExternalDomain
public class RecordedAtConverter implements DomainConverter<RecordedAt, String> {

	@Override
	public String fromDomainToValue(RecordedAt domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecordedAt fromValueToDomain(String value) {
		return new RECORDED_AT(value);
	}

}
