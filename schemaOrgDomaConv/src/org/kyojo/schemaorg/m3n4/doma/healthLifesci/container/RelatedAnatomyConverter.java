package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RELATED_ANATOMY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelatedAnatomy;

@ExternalDomain
public class RelatedAnatomyConverter implements DomainConverter<RelatedAnatomy, String> {

	@Override
	public String fromDomainToValue(RelatedAnatomy domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedAnatomy fromValueToDomain(String value) {
		return new RELATED_ANATOMY(value);
	}

}
