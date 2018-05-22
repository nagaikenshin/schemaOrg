package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ASSEMBLY_VERSION;
import org.kyojo.schemaOrg.m3n3.core.Container.AssemblyVersion;

@ExternalDomain
public class AssemblyVersionConverter implements DomainConverter<AssemblyVersion, String> {

	@Override
	public String fromDomainToValue(AssemblyVersion domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssemblyVersion fromValueToDomain(String value) {
		return new ASSEMBLY_VERSION(value);
	}

}
