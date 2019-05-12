package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BARCODE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Barcode;

@ExternalDomain
public class BarcodeConverter implements DomainConverter<Barcode, String> {

	@Override
	public String fromDomainToValue(Barcode domain) {
		return domain.getNativeValue();
	}

	@Override
	public Barcode fromValueToDomain(String value) {
		return new BARCODE(value);
	}

}
