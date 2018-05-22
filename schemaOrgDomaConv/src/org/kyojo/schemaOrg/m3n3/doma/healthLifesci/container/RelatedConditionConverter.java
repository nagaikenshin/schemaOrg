package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RELATED_CONDITION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedCondition;

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
