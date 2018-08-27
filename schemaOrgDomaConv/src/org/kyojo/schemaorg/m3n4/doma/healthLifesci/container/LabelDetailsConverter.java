package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.LABEL_DETAILS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.LabelDetails;

@ExternalDomain
public class LabelDetailsConverter implements DomainConverter<LabelDetails, String> {

	@Override
	public String fromDomainToValue(LabelDetails domain) {
		return domain.getNativeValue();
	}

	@Override
	public LabelDetails fromValueToDomain(String value) {
		return new LABEL_DETAILS(value);
	}

}
