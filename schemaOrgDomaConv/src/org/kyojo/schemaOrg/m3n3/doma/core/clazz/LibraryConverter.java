package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LIBRARY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Library;

@ExternalDomain
public class LibraryConverter implements DomainConverter<Library, String> {

	@Override
	public String fromDomainToValue(Library domain) {
		return domain.getNativeValue();
	}

	@Override
	public Library fromValueToDomain(String value) {
		return new LIBRARY(value);
	}

}
