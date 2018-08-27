package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.EXECUTABLE_LIBRARY_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.ExecutableLibraryName;

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
