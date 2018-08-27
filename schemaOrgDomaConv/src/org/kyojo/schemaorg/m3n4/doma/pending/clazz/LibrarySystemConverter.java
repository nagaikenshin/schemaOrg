package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LIBRARY_SYSTEM;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LibrarySystem;

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