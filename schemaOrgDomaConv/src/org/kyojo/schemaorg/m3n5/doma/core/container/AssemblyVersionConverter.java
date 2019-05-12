package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ASSEMBLY_VERSION;
import org.kyojo.schemaorg.m3n5.core.Container.AssemblyVersion;

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
