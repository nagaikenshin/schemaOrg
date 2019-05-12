package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LEARNING_RESOURCE_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.LearningResourceType;

@ExternalDomain
public class LearningResourceTypeConverter implements DomainConverter<LearningResourceType, String> {

	@Override
	public String fromDomainToValue(LearningResourceType domain) {
		return domain.getNativeValue();
	}

	@Override
	public LearningResourceType fromValueToDomain(String value) {
		return new LEARNING_RESOURCE_TYPE(value);
	}

}
