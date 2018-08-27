package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TARGET_COLLECTION;
import org.kyojo.schemaorg.m3n4.core.Container.TargetCollection;

@ExternalDomain
public class TargetCollectionConverter implements DomainConverter<TargetCollection, String> {

	@Override
	public String fromDomainToValue(TargetCollection domain) {
		return domain.getNativeValue();
	}

	@Override
	public TargetCollection fromValueToDomain(String value) {
		return new TARGET_COLLECTION(value);
	}

}
