package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.STORAGE_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.StorageRequirements;

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
