package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MEMORY_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.MemoryRequirements;

@ExternalDomain
public class MemoryRequirementsConverter implements DomainConverter<MemoryRequirements, String> {

	@Override
	public String fromDomainToValue(MemoryRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public MemoryRequirements fromValueToDomain(String value) {
		return new MEMORY_REQUIREMENTS(value);
	}

}
