package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LIBRARY_SYSTEM;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LibrarySystem;

@ExternalDomain
public class LibrarySystemConverter implements DomainConverter<LibrarySystem, String> {

	@Override
	public String fromDomainToValue(LibrarySystem domain) {
		return domain.getNativeValue();
	}

	@Override
	public LibrarySystem fromValueToDomain(String value) {
		return new LIBRARY_SYSTEM(value);
	}

}
