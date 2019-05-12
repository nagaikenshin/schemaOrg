package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.SHEET_MUSIC;
import org.kyojo.schemaorg.m3n5.pending.Clazz.SheetMusic;

@ExternalDomain
public class SheetMusicConverter implements DomainConverter<SheetMusic, String> {

	@Override
	public String fromDomainToValue(SheetMusic domain) {
		return domain.getNativeValue();
	}

	@Override
	public SheetMusic fromValueToDomain(String value) {
		return new SHEET_MUSIC(value);
	}

}
