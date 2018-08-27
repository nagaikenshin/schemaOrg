package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.RELATED_CONDITION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.RelatedCondition;

@ExternalDomain
public class RelatedConditionConverter implements DomainConverter<RelatedCondition, String> {

	@Override
	public String fromDomainToValue(RelatedCondition domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedCondition fromValueToDomain(String value) {
		return new RELATED_CONDITION(value);
	}

}
