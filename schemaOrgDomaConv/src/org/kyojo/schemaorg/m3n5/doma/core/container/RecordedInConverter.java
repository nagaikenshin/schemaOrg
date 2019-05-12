package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECORDED_IN;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedIn;

@ExternalDomain
public class RecordedInConverter implements DomainConverter<RecordedIn, String> {

	@Override
	public String fromDomainToValue(RecordedIn domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecordedIn fromValueToDomain(String value) {
		return new RECORDED_IN(value);
	}

}
