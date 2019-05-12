package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.RECOGNIZED_BY;
import org.kyojo.schemaorg.m3n5.pending.Container.RecognizedBy;

@ExternalDomain
public class RecognizedByConverter implements DomainConverter<RecognizedBy, String> {

	@Override
	public String fromDomainToValue(RecognizedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecognizedBy fromValueToDomain(String value) {
		return new RECOGNIZED_BY(value);
	}

}
