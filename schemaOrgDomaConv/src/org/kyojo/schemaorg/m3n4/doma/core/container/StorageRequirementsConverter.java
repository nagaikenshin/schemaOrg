package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.STORAGE_REQUIREMENTS;
import org.kyojo.schemaorg.m3n4.core.Container.StorageRequirements;

@ExternalDomain
public class StorageRequirementsConverter implements DomainConverter<StorageRequirements, String> {

	@Override
	public String fromDomainToValue(StorageRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public StorageRequirements fromValueToDomain(String value) {
		return new STORAGE_REQUIREMENTS(value);
	}

}
