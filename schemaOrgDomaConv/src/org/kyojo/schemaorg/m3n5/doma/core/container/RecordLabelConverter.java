package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RECORD_LABEL;
import org.kyojo.schemaorg.m3n5.core.Container.RecordLabel;

@ExternalDomain
public class RecordLabelConverter implements DomainConverter<RecordLabel, String> {

	@Override
	public String fromDomainToValue(RecordLabel domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecordLabel fromValueToDomain(String value) {
		return new RECORD_LABEL(value);
	}

}
