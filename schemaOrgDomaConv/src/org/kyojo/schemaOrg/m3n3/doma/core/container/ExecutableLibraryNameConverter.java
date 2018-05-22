package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.EXECUTABLE_LIBRARY_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.ExecutableLibraryName;

@ExternalDomain
public class ExecutableLibraryNameConverter implements DomainConverter<ExecutableLibraryName, String> {

	@Override
	public String fromDomainToValue(ExecutableLibraryName domain) {
		return domain.getNativeValue();
	}

	@Override
	public ExecutableLibraryName fromValueToDomain(String value) {
		return new EXECUTABLE_LIBRARY_NAME(value);
	}

}
