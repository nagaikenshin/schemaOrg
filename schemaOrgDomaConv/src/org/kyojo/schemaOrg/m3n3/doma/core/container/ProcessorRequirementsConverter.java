package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROCESSOR_REQUIREMENTS;
import org.kyojo.schemaOrg.m3n3.core.Container.ProcessorRequirements;

@ExternalDomain
public class ProcessorRequirementsConverter implements DomainConverter<ProcessorRequirements, String> {

	@Override
	public String fromDomainToValue(ProcessorRequirements domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProcessorRequirements fromValueToDomain(String value) {
		return new PROCESSOR_REQUIREMENTS(value);
	}

}
