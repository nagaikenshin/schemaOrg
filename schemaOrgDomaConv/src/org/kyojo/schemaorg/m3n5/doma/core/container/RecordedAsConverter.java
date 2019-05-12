package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECORDED_AS;
import org.kyojo.schemaorg.m3n5.core.Container.RecordedAs;

@ExternalDomain
public class RecordedAsConverter implements DomainConverter<RecordedAs, String> {

	@Override
	public String fromDomainToValue(RecordedAs domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecordedAs fromValueToDomain(String value) {
		return new RECORDED_AS(value);
	}

}
