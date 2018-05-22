package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RECORDED_AT;
import org.kyojo.schemaOrg.m3n3.core.Container.RecordedAt;

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
