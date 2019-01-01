#!/usr/bin/perl

use strict;
use warnings;
use utf8;
use RDF::Trine;
use RDF::Trine::Parser;
use File::Path qw/mkpath/;
use Data::Dumper;

binmode (STDOUT, ':utf8');
binmode (STDERR, ':utf8');

my $cur_ver_str = 'm3n4';
my $prv_ver_str = 'm3n3';
my $base_dpath = '/home/nagai/kyojo/schemaOrg201804';
my $url = "file:/$base_dpath/data/$cur_ver_str/all-layers.nq";
my $out1_dpath = "$base_dpath/schemaOrgWork/src/org/kyojo/schemaorg/";
my $out2_dpath = "$out1_dpath$cur_ver_str/";
my $pkg1_base = 'org.kyojo.schemaorg';
my $pkg2_base = "$pkg1_base.$cur_ver_str";
my $wrn_fpath = 'warn.txt';
my $tpi_fpath = 'type_value_in.tsv';
my $tpo_fpath = 'type_value_out.tsv';
my $flt_fpath = "$base_dpath/schemaOrgGson/src/org/kyojo/schemaorg/$cur_ver_str/gson/GsonTypeAdapters.properties";
my $abb_fpath = 'abbrev.txt';
my $ntv_fpath = 'native_value.tsv';
my $sup_fpath = 'sup.tsv';
my $sub_fpath = 'sub.tsv';
my $rng_fpath = 'rng.tsv';
my $dmn_fpath = 'dmn.tsv';

my %type_value_defs = ();
open (FIN, $tpi_fpath) || die "cannot open $tpi_fpath: $!";
binmode (FIN, ':utf8');
while (<FIN>) {
	s/[ \r\n]+$//;

	my @vals = split (/\t/);
	if (@vals == 4) {
		$type_value_defs{"$vals[0]\t$vals[1]\t$vals[2]"} = $vals[3] + 0;
	}
}
close FIN;

my %flt_defs = ();
open (FIN, $flt_fpath) || die "cannot open $flt_fpath: $!";
binmode (FIN, ':utf8');
while (<FIN>) {
	s/[ \r\n]+$//;

	if (/^#/) {
		next;
	}

	my @vals = split (/=/);
	if (@vals == 2) {
		$flt_defs{$vals[0]} = 1;
	}
}
close FIN;

open (FWRN, '>' . $wrn_fpath) or die "can't open $wrn_fpath: $!";
binmode (FWRN, ':utf8');

open (FTPO, '>' . $tpo_fpath) or die "can't open $tpo_fpath: $!";
binmode (FTPO, ':utf8');

open (FABB, '>' . $abb_fpath) or die "can't open $abb_fpath: $!";
binmode (FABB, ':utf8');

open (FNTV, '>' . $ntv_fpath) or die "can't open $ntv_fpath: $!";
binmode (FNTV, ':utf8');

open (FSUP, '>' . $sup_fpath) or die "can't open $sup_fpath: $!";
binmode (FSUP, ':utf8');

open (FSUB, '>' . $sub_fpath) or die "can't open $sub_fpath: $!";
binmode (FSUB, ':utf8');

open (FRNG, '>' . $rng_fpath) or die "can't open $rng_fpath: $!";
binmode (FRNG, ':utf8');

open (FDMN, '>' . $dmn_fpath) or die "can't open $dmn_fpath: $!";
binmode (FDMN, ':utf8');

my $store = RDF::Trine::Store::Memory->new ();
my $model = RDF::Trine::Model->new ($store);
RDF::Trine::Parser->parse_url_into_model ($url, $model);

my $hsrf = $model->as_hashref;
my $opts = {
	'domain_uris' => {},
};
retrieve ($hsrf, 0, $opts);

sub retrieve {
	my $var = shift;
	my $depth = shift;
	my $opts = shift;

	if (ref ($var) eq 'HASH') {
		if ($depth != 0 && $depth != 1 && $depth != 3) {
			die Dumper $var;
		}

		my %hs = %$var;
		foreach (sort keys %hs) {
			if ($depth == 0) {
				if (!exists $opts->{domain_uris}{$_}) {
					$opts->{domain_uris}{$_} = {};
				}
				$opts->{domain_uri} = $_;
				$opts->{property_uris} = $hs{$_};
			} elsif ($depth == 1) {
				$opts->{property_uri} = $_;
			} elsif ($depth == 3) {
				$opts->{$_} = $hs{$_};
			}

			retrieve ($hs{$_}, $depth + 1, $opts);
		}
	} elsif (ref ($var) eq 'ARRAY') {
		if ($depth != 2) {
			die Dumper $var;
		}

		my @ar = @$var;
		foreach (@ar) {
			retrieve ($_, $depth + 1, $opts);

			if ($depth == 2) {
				if ($opts->{property_uri} eq 'http://www.w3.org/2000/01/rdf-schema#label'
						|| $opts->{property_uri} eq 'http://www.w3.org/2000/01/rdf-schema#comment') {
					if ($opts->{type} ne 'literal') {
						die Dumper $var;
					}
					$opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}} = $opts->{value};
				} elsif ($opts->{property_uri} eq 'http://schema.org/isPartOf') {
					if ($opts->{type} ne 'uri') {
						die Dumper $var;
					}
					if (exists $opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}}) {
						print "part already exists.\n";
						die Dumper $var;
					}
					$opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}} = $opts->{value};
				} elsif ($opts->{property_uri} eq 'http://www.w3.org/2000/01/rdf-schema#subClassOf'
						|| $opts->{property_uri} eq 'http://www.w3.org/2000/01/rdf-schema#subPropertyOf'
						|| $opts->{property_uri} eq 'http://www.w3.org/1999/02/22-rdf-syntax-ns#type') {
					if ($opts->{type} ne 'uri') {
						die Dumper $var;
					}
					if (!exists $opts->{domain_uris}{$opts->{domain_uri}}) {
						$opts->{domain_uris}{$opts->{domain_uri}} = {};
					}
					if (!exists $opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}}) {
						$opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}} = [];
					}
					my $props = $opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}};
					push (@$props, $opts->{value});
				} elsif ($opts->{property_uri} eq 'http://schema.org/rangeIncludes') {
					if ($opts->{type} ne 'uri') {
						die Dumper $var;
					}
					if (!exists $opts->{domain_uris}{$opts->{domain_uri}}) {
						$opts->{domain_uris}{$opts->{domain_uri}} = {};
					}
					if (!exists $opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}}) {
						$opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}} = {};
					}
					my $props = $opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}};
					$props->{$opts->{value}} = 1;
				} elsif ($opts->{property_uri} eq 'http://schema.org/domainIncludes') {
					if ($opts->{type} ne 'uri') {
						die Dumper $var;
					}
					if (!exists $opts->{domain_uris}{$opts->{value}}) {
						$opts->{domain_uris}{$opts->{value}} = {};
					}
					if (!exists $opts->{domain_uris}{$opts->{value}}{$opts->{property_uri}}) {
						$opts->{domain_uris}{$opts->{value}}{$opts->{property_uri}} = {};
					}
					my $props = $opts->{domain_uris}{$opts->{value}}{$opts->{property_uri}};
					$props->{$opts->{domain_uri}} = 1;
				} elsif ($opts->{property_uri} eq 'http://schema.org/supersededBy') {
					if ($opts->{type} ne 'uri') {
						die Dumper $var;
					}
					$opts->{domain_uris}{$opts->{domain_uri}}{$opts->{property_uri}} = $opts->{value};
				}
			}
		}
	} elsif (ref ($var) eq 'SCALAR') {
		die Dumper $var;

		# print "$$var\n";
	} else {
		if ($depth != 4) {
			die Dumper $var;
		}

		# print "$var\n";
	}
}

# 日本語用にふりがなは必須
my $domain_uris = $opts->{domain_uris};
my $domainSrc = $domain_uris->{'http://schema.org/name'};
my $domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'nameRuby';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Japanese furigana name and things like that.';
$domain_uris->{'http://kyojo.org/schemaSpl/nameRuby'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/givenName'};
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'givenNameRuby';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Given name. Japanese furigana and things like that.';
$domain_uris->{'http://kyojo.org/schemaSpl/givenNameRuby'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/familyName'};
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'familyNameRuby';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Family name. Japanese furigana and things like that.';
$domain_uris->{'http://kyojo.org/schemaSpl/familyNameRuby'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/name'};
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'nameFuzzy';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'The normalized name. Variant characters, the space between given and family name, etc.';
$domain_uris->{'http://kyojo.org/schemaSpl/nameFuzzy'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/streetAddress'};
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'buildingAddress';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'The building address.';
$domain_uris->{'http://kyojo.org/schemaSpl/buildingAddress'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/URL'};
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'HTML';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'HTML formatted text.';
$domain_uris->{'http://kyojo.org/schemaSpl/HTML'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'LaTeX';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'LaTeX format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/LaTeX'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'Markdown';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Markdown format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/Markdown'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'AsciiDoc';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'AsciiDoc format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/AsciiDoc'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'RTF';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'RTF format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/RTF'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'Hatena';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Hatena notation source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/Hatena'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'Textile';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Textile notation source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/Textile'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'DokuWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'DokuWiki format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/DokuWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'MoinMoin';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'MoinMoin format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/MoinMoin'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'MediaWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'MediaWiki format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/MediaWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'PukiWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'PukiWiki format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/PukiWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'Simple';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Simple format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/Simple'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'RedmineWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Redmine Wiki format source text.';
$domain_uris->{'http://kyojo.org/schemaSpl/RedmineWiki'} = $domainDst;

$domainSrc = $domain_uris->{'http://schema.org/url'};
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/HTML' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'html';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'HTML format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/html'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/LaTeX' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'latex';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'LaTeX format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/latex'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/Markdown' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'markdown';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Markdown format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/markdown'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/AsciiDoc' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'asciiDoc';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'AsciiDoc format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/asciiDoc'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/RTF' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'rtf';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'RTF format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/rtf'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/Hatena' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'hatena';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Hatena notation text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/hatena'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/Textile' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'textile';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Textile notation text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/textile'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/DokuWiki' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'dokuWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'DokuWiki format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/dokuWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/MoinMoin' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'moinMoin';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'MoinMoin format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/moinMoin'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/MediaWiki' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'mediaWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'MediaWiki format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/mediaWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/PukiWiki' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'pukiWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'PukiWiki format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/pukiWiki'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/Simple' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'simple';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Simple format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/simple'} = $domainDst;
$domainDst = { %$domainSrc };
$domainDst->{'http://schema.org/rangeIncludes'} = { 'http://kyojo.org/schemaSpl/RedmineWiki' => 1 };
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#label'} = 'redmineWiki';
$domainDst->{'http://www.w3.org/2000/01/rdf-schema#comment'} = 'Redmine Wiki format source text of the item.';
$domain_uris->{'http://kyojo.org/schemaSpl/redmineWiki'} = $domainDst;

$domain_uris->{'http://schema.org/Thing'}{'http://schema.org/domainIncludes'}{'http://kyojo.org/schemaSpl/nameRuby'} = 1;
$domain_uris->{'http://schema.org/Thing'}{'http://schema.org/domainIncludes'}{'http://kyojo.org/schemaSpl/nameFuzzy'} = 1;
$domain_uris->{'http://schema.org/Person'}{'http://schema.org/domainIncludes'}{'http://kyojo.org/schemaSpl/givenNameRuby'} = 1;
$domain_uris->{'http://schema.org/Person'}{'http://schema.org/domainIncludes'}{'http://kyojo.org/schemaSpl/familyNameRuby'} = 1;
$domain_uris->{'http://schema.org/PostalAddress'}{'http://schema.org/domainIncludes'}{'http://kyojo.org/schemaSpl/buildingAddress'} = 1;

my %lc_names = ();
my %type_fulls = ();
my %type2uris = ();
my %type2names = ();
my %full2domains = ();
foreach my $domain_uri (sort keys %$domain_uris) {
	print "$domain_uri\n";
	my $domain = $domain_uris->{$domain_uri};
	$domain->{this_uri} = $domain_uri;
	$domain->{extension} = 'core';
	$domain->{this_pkg} = $pkg2_base . '.core';

	if ($domain_uri =~ /\/\/[a-z0-9\-\.]*schema\.org\/(\w+)$/ || $domain_uri =~ /\/\/kyojo\.org\/schemaSpl\/(\w+)$/) {
		my $this_name = ucfirst ($1);
		my $this_name2 = pascalize (tableize ($this_name));
		if ($this_name2 eq 'LaTeX') {
			$this_name = $this_name2;
		} elsif ($this_name ne $this_name2) {
			print "this_name is not normalized. ($this_name,$this_name2)\n";
			die Dumper $domain;
		}

		$domain->{this_name} = $this_name;
	} elsif ($domain_uri =~ /\/\/[a-z0-9\-\.]*schema\.org\/$/) {
		print "cover page's property? ignored: $domain_uri\n";
		print FWRN "cover page's property? ignored: $domain_uri\n";
		print FWRN Dumper $domain;
		next;
	} elsif ($domain_uri =~ /\/danbri\//
		|| $domain_uri =~ /\/wallisr\//
		|| $domain_uri =~ /\/\/www\.w3\.org\/ns\/regorg/
		|| $domain_uri =~ /\/\/www\.w3\.org\/wiki\/WebSchemas\/SchemaDotOrgSources/
		|| $domain_uri =~ /\/\/publications\.europa\.eu/) {
		print "this_name is not schema.org. ignored: $domain_uri\n";
		print FWRN "this_name is not schema.org. ignored: $domain_uri\n";
		print FWRN Dumper $domain;
		next;
	} else {
		print "this_name is not schema.org.\n";
		die Dumper $domain;
	}

	foreach my $property (sort keys %$domain) {
		print "$property =>\n";
		print Dumper $domain->{$property};
		if ($property eq 'http://schema.org/isPartOf') {
			if ($domain->{$property} =~ /\/\/([\w\-]+)\.schema\.org\/?$/) {
				my $extension = camelize ($1);
				$domain->{extension} = $extension;
				$domain->{this_pkg} = $pkg2_base . '.' . $extension;
			} else {
				print "isPartOf is not schema.org.\n";
				die Dumper $domain;
			}
		} elsif ($property eq 'http://www.w3.org/2000/01/rdf-schema#subClassOf'
				|| $property eq 'http://www.w3.org/2000/01/rdf-schema#subPropertyOf') {
			my $props = $domain->{$property};
			foreach my $prop (@$props) {
				if ($prop =~ /\/\/[a-z0-9\-\.]*schema\.org\/\w+$/) {
					$domain->{super_uris}{$prop} = 1;
				} elsif ($prop =~ /\/\/www\.w3\.org\/2000\/01\/rdf-schema/
						|| $prop =~ /\/\/www\.w3\.org\/1999\/02\/22-rdf-syntax-ns/
						|| $prop =~ /rdfs:label/) {
					print "subClassOf is not schema.org. ignored: $prop\n";
					print FWRN "subClassOf is not schema.org. ignored: $prop\n";
					print FWRN Dumper $domain;
				} else {
					print "subClassOf is not schema.org.\n";
					die Dumper $domain;
				}
			}
		} elsif ($property eq 'http://www.w3.org/1999/02/22-rdf-syntax-ns#type') {
			my $props = $domain->{$property};
			foreach my $prop (@$props) {
				if ($prop =~ /\/\/([\w\-]+)\.schema\.org\//) {
					print "type has extension type.\n";
					die Dumper $domain;
				}

				if ($prop =~ /\/\/schema\.org\/(\w+)$/) {
					# [個別対応] typeが複数
					# とりあえず、より主と思われるほうをTypeにして後からextend →変更
					# if ($domain_uri eq 'http://schema.org/Radiography'
					#			&& $prop eq 'http://schema.org/MedicalImagingTechnique') {
					#	next;
					# }

					if ('class' eq lc $1) {
						print "type has schema.org's class.\n";
						die Dumper $domain;
					}
					add_type ($domain_uri, $domain, $prop, $1, \%type_fulls, \%type2uris, \%type2names);
				} elsif ($prop eq 'http://www.w3.org/1999/02/22-rdf-syntax-ns#Property') {
					add_type ($domain_uri, $domain, $prop, 'container', \%type_fulls, \%type2uris, \%type2names);
				} elsif ($prop eq 'http://www.w3.org/2000/01/rdf-schema#Class') {
					# [個別対応] typeの組が例外的
					# とりあえず、Classは無視
					if ($domain_uri eq 'http://schema.org/SurgicalProcedure') {
						next;
					}

					add_type ($domain_uri, $domain, $prop, 'class', \%type_fulls, \%type2uris, \%type2names);
				} else {
					print "type and Property not match.\n";
					die Dumper $domain;
				}
			}
		}
	}

	if (!exists $domain->{type_fulls}) {
		print "no types.\n";
		die Dumper $domain;
	}
	my $domain_type_fulls = $domain->{type_fulls};
	my $domain_type_full_cnt = 0 + keys %$domain_type_fulls;
	if ($domain_type_full_cnt == 1) {
		foreach my $type_full (sort keys %$domain_type_fulls) {
			$domain->{type_pri} = $type_full;
		}
	} elsif ($domain_type_full_cnt == 2) {
		my $class_cnt = 0;
		my $data_type_cnt = 0;
		foreach my $type_full (sort keys %$domain_type_fulls) {
			# print "$type_fulls{$type_full}{$domain_uri}\n";
			if ($type_fulls{$type_full}{$domain_uri} eq 'Clazz') {
				delete $type_fulls{$type_full}{$domain_uri};
				delete $domain->{type_fulls}{$type_full};
				$class_cnt++;
			} elsif ($type_fulls{$type_full}{$domain_uri} eq 'DataType') {
				$domain->{type_pri} = $type_full;
				$data_type_cnt++;
			}
		}
		if ($class_cnt == 1 && $data_type_cnt == 1) {
			# typeが2つあるのはClassとDataTypeの共存のみ？ →例外あり
		} else {
			# [個別対応] typeが複数
			if ($domain_uri eq 'http://schema.org/Radiography') {
			} else {
				print "types pair error.\n";
				die Dumper $domain;
			}
		}
	} else {
		print "types count error.\n";
		die Dumper $domain;
	}

	my $lc_name = lc ($domain->{this_pkg} . '.' . $domain->{this_name});
	if (exists $lc_names{$lc_name}) {
		print FWRN "duplicate lc_name: $lc_name\n";
	}
	$lc_names{$lc_name} = 1;
	$full2domains{"$domain->{this_pkg}.$domain->{this_name}"} = $domain;
}

foreach my $domain_uri (sort keys %$domain_uris) {
	my $domain = $domain_uris->{$domain_uri};
	my @successive = ();
	retrieve_subclasses ($domain, \@successive, 0);
	print FSUP "\n";
}

foreach my $domain_uri (sort keys %$domain_uris) {
	my $domain = $domain_uris->{$domain_uri};
	print FSUB "$domain->{type_pri}" . '$' . "$domain->{this_name}\n";
	if (exists $domain->{drct_subclasses}) {
		foreach my $sub_uri (sort keys %{$domain->{drct_subclasses}}) {
			my $sub_domain = $domain_uris->{$sub_uri};
			print FSUB "\t$sub_domain->{type_pri}" . '$' . "$sub_domain->{this_name}\n";
		}
	}
	if (exists $domain->{all_subclasses}) {
		foreach my $sub_uri (sort keys %{$domain->{all_subclasses}}) {
			my $sub_domain = $domain_uris->{$sub_uri};
			print FSUB "\t\t$sub_domain->{type_pri}" . '$' . "$sub_domain->{this_name}\n";
		}
	}
	print FSUB "\n";
}

sub add_type {
	my $domain_uri = shift;
	my $domain = shift;
	my $prop = shift;
	my $type = shift;
	my $type_fulls = shift;
	my $type2uris = shift;
	my $type2names = shift;

	my $type_name = ucfirst ($type);
	if ($type_name eq 'Class') {
		$type_name = 'Clazz';
	} elsif ($type_name eq 'Boolean') {
		$type_name = 'B00lean';
	}
	# this_pkg別にtypeを作る
	my $full = $domain->{this_pkg} . '.' . $type_name;

	$type_fulls->{$full}{$domain_uri} = $type_name;
	$domain->{type_fulls}{$full} = 1;
	$type2uris->{$full} = $prop;
	$type2names->{$full} = $type_name;
}

sub retrieve_subclasses {
	my $tgt_domain = shift;
	my $successive = shift;
	my $depth = shift;

	print FSUP "\t" x $depth . "$tgt_domain->{type_pri}" . '$' . "$tgt_domain->{this_name}\n";

	push (@$successive, $tgt_domain);
	if (exists $tgt_domain->{super_uris}) {
		my $super_uris = $tgt_domain->{super_uris};
		foreach my $super_uri (sort keys %$super_uris) {
			my $s_domain = '';
			if (exists $domain_uris->{$super_uri}) {
				$s_domain = $domain_uris->{$super_uri};
			} else {
				if ($super_uri =~ /^(.+\/\/)([a-z0-9\-\.]*)(schema\.org\/\w+)$/) {
					my $tmp_uri = $1 . $3;
					if (exists $domain_uris->{$tmp_uri}) {
						$s_domain = $domain_uris->{$tmp_uri};
					}
				}
			}
			if ($s_domain eq '') {
				print "couldn't find $super_uri in \$domain_uris\n";
				die;
			}

			$s_domain->{drct_subclasses}{$tgt_domain->{this_uri}} = 1;
			foreach my $tmp_domain (@$successive) {
				$s_domain->{all_subclasses}{$tmp_domain->{this_uri}} = $depth + 1;
			}

			retrieve_subclasses ($s_domain, $successive, $depth + 1);
		}
	}
	pop @$successive;
}

eval {
	mkpath $out2_dpath;
};

my $out_fpath = $out1_dpath . 'Jsonizable.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

import java.io.Serializable;

public interface Jsonizable extends Serializable {
}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgType.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

\@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#type")
public interface SchemaOrgType extends Jsonizable {
}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgClass.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

\@SchemaOrgURI("http://www.w3.org/2000/01/rdf-schema#Class")
public interface SchemaOrgClass extends SchemaOrgType {

	public Long getSeq();
	public void setSeq(Long seq);
	public Long getRefSeq();
	public void setRefSeq(Long refSeq);
	public String getRefAcr();
	public void setRefAcr(String refAcr);
	public java.util.Date getCreatedAt();
	public void setCreatedAt(java.util.Date createdAt);
	public Long getCreatedBy();
	public void setCreatedBy(Long createdBy);
	public java.util.Date getUpdatedAt();
	public void setUpdatedAt(java.util.Date updatedAt);
	public Long getUpdatedBy();
	public void setUpdatedBy(Long updatedBy);
	public java.util.Date getExpiredAt();
	public void setExpiredAt(java.util.Date expiredAt);
	public Long getExpiredBy();
	public void setExpiredBy(Long expiredBy);

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgProperty.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

\@SchemaOrgURI("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")
public interface SchemaOrgProperty extends SchemaOrgType {
}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgURI.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SchemaOrgURI {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgLabel.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SchemaOrgLabel {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SchemaOrgComment.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SchemaOrgComment {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SampleValue.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SampleValue {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'JsonLdContext.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonLdContext {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'CamelizedName.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CamelizedName {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'ConstantizedName.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConstantizedName {

	String value();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'JsonListIndex.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonListIndex {
}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'JsonListNo.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface JsonListNo {
}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueBoolean.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueBoolean {

	public Boolean getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueDate.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueDate {

	public java.util.Date getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueDateTime.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueDateTime {

	public java.util.Date getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueFloat.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueFloat {

	public Double getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueInteger.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueInteger {

	public Long getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueNumber.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

import java.math.BigDecimal;

public interface NativeValueNumber {

	public BigDecimal getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueText.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueText {

	public String getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueTime.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT "package $pkg1_base;\n";
print FOUT << 'EoS';

public interface NativeValueTime {

	public java.util.Date getNativeValue();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerBoolean.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerBoolean {

	public DataType.Boolean getB00lean();
	public void setB00lean(DataType.Boolean b00lean);
	public List<DataType.Boolean> getB00leanList();
	public void setB00leanList(List<DataType.Boolean> b00leanList);
	public boolean hasB00lean();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerDate.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerDate {

	public DataType.Date getDate();
	public void setDate(DataType.Date date);
	public List<DataType.Date> getDateList();
	public void setDateList(List<DataType.Date> dateList);
	public boolean hasDate();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerDateTime.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerDateTime {

	public DataType.DateTime getDateTime();
	public void setDateTime(DataType.DateTime dateTime);
	public List<DataType.DateTime> getDateTimeList();
	public void setDateTimeList(List<DataType.DateTime> dateTimeList);
	public boolean hasDateTime();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerFloat.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.Clazz;

public interface ContainerFloat {

	public Clazz.Float getFl0at();
	public void setFl0at(Clazz.Float fl0at);
	public List<Clazz.Float> getFl0atList();
	public void setFl0atList(List<Clazz.Float> fl0atList);
	public boolean hasFl0at();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerInteger.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.Clazz;

public interface ContainerInteger {

	public Clazz.Integer getInteger();
	public void setInteger(Clazz.Integer integer);
	public List<Clazz.Integer> getIntegerList();
	public void setIntegerList(List<Clazz.Integer> integerList);
	public boolean hasInteger();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerNumber.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerNumber {

	public DataType.Number getNumber();
	public void setNumber(DataType.Number number);
	public List<DataType.Number> getNumberList();
	public void setNumberList(List<DataType.Number> numberList);
	public boolean hasNumber();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerText.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerText {

	public DataType.Text getText();
	public void setText(DataType.Text text);
	public List<DataType.Text> getTextList();
	public void setTextList(List<DataType.Text> textList);
	public boolean hasText();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerTime.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.DataType;

public interface ContainerTime {

	public DataType.Time getTime();
	public void setTime(DataType.Time time);
	public List<DataType.Time> getTimeList();
	public void setTimeList(List<DataType.Time> timeList);
	public boolean hasTime();

}
EoS
close FOUT;

$out_fpath = $out2_dpath . 'ContainerURL.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base.$cur_ver_str;

import java.util.List;

import $pkg1_base.$cur_ver_str.core.Clazz;

public interface ContainerURL {

	public Clazz.URL getURL();
	public void setURL(Clazz.URL url);
	public List<Clazz.URL> getURLList();
	public void setURLList(List<Clazz.URL> urlList);
	public boolean hasURL();

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'NativeValueDataType.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This is the enum for providing schemaOrg data type mappings to Java native classes.
 */
public enum NativeValueDataType {

	TEXT("text", String.class,
			ConsistentDataType.Text.class,
			$pkg1_base.$prv_ver_str.core.DataType.Text.class),
	DATE_TIME("dateTime", OffsetDateTime.class,
			ConsistentDataType.DateTime.class,
			$pkg1_base.$prv_ver_str.core.DataType.DateTime.class),
	DATE("date", LocalDate.class,
			ConsistentDataType.Date.class,
			$pkg1_base.$prv_ver_str.core.DataType.Date.class),
	TIME("time", LocalTime.class,
			ConsistentDataType.Time.class,
			$pkg1_base.$prv_ver_str.core.DataType.Time.class),
	FLOAT("fl0at", Double.class,
			ConsistentDataType.Float.class,
			$pkg1_base.$prv_ver_str.core.Clazz.Float.class),
	INTEGER("integer", Long.class,
			ConsistentDataType.Integer.class,
			$pkg1_base.$prv_ver_str.core.Clazz.Integer.class),
	NUMBER("number", BigDecimal.class,
			ConsistentDataType.Number.class,
			$pkg1_base.$prv_ver_str.core.DataType.Number.class),
	BOOLEAN("b00lean", Boolean.class,
			ConsistentDataType.Boolean.class,
			$pkg1_base.$prv_ver_str.core.DataType.Boolean.class);

	private final String suffix;
	private final Class<?> nativeValueClass;
	private final Class<?> curDataTypeClass;
	private final Class<?> prvDataTypeClass;

	private NativeValueDataType(final String suffix, final Class<?> nativeValueClass,
			Class<?> curDataTypeClass, Class<?> prvDataTypeClass) {
		this.suffix = suffix;
		this.nativeValueClass = nativeValueClass;
		this.curDataTypeClass = curDataTypeClass;
		this.prvDataTypeClass = prvDataTypeClass;
	}

	public String getSuffix() {
		return suffix;
	}

	public Class<?> getNativeValueClass() {
		return nativeValueClass;
	}

	public Class<?> getCurDataTypeClass() {
		return curDataTypeClass;
	}

	public Class<?> getPrvDataTypeClass() {
		return prvDataTypeClass;
	}

	public static NativeValueDataType getEnumByDataTypeClass(final Class<?> cls) {
		final NativeValueDataType[] nvdts = values();
		for(final NativeValueDataType nvdt : nvdts) {
			if(nvdt.getCurDataTypeClass().isAssignableFrom(cls)) {
				return nvdt;
			} else if(nvdt.getPrvDataTypeClass().isAssignableFrom(cls)) {
				return nvdt;
			}
		}
		return null;
	}

	public static String dataTypeToString(Object dt, NativeValueDataType nvdt) {
		if(dt == null) return "";

		switch(nvdt) {
		case TEXT:
			if(dt instanceof ConsistentDataType.Text) {
				ConsistentDataType.Text text = (ConsistentDataType.Text)dt;
				if(text.getString() == null) {
					return "";
				} else {
					return text.getString();
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.Text) {
				$pkg1_base.$prv_ver_str.core.DataType.Text text = ($pkg1_base.$prv_ver_str.core.DataType.Text)dt;
				if(text.getString() == null) {
					return "";
				} else {
					return text.getString();
				}
			} else {
				return "";
			}
		case DATE_TIME:
			if(dt instanceof ConsistentDataType.DateTime) {
				ConsistentDataType.DateTime dateTime = (ConsistentDataType.DateTime)dt;
				if(dateTime.getDateTime() == null) {
					return "";
				} else {
					DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
					return dateTime.getDateTime().format(ymdhmszDtf);
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.DateTime) {
				$pkg1_base.$prv_ver_str.core.DataType.DateTime dateTime = ($pkg1_base.$prv_ver_str.core.DataType.DateTime)dt;
				if(dateTime.getDateTime() == null) {
					return "";
				} else {
					DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
					return dateTime.getDateTime().format(ymdhmszDtf);
				}
			} else {
				return "";
			}
		case DATE:
			if(dt instanceof ConsistentDataType.Date) {
				ConsistentDataType.Date date = (ConsistentDataType.Date)dt;
				if(date.getDate() == null) {
					return "";
				} else {
					DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					return date.getDate().format(ymdDtf);
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.Date) {
				$pkg1_base.$prv_ver_str.core.DataType.Date date = ($pkg1_base.$prv_ver_str.core.DataType.Date)dt;
				if(date.getDate() == null) {
					return "";
				} else {
					DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					return date.getDate().format(ymdDtf);
				}
			} else {
				return "";
			}
		case TIME:
			if(dt instanceof ConsistentDataType.Time) {
				ConsistentDataType.Time time = (ConsistentDataType.Time)dt;
				if(time.getTime() == null) {
					return "";
				} else {
					DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					return time.getTime().format(hmsDtf);
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.Time) {
				$pkg1_base.$prv_ver_str.core.DataType.Time time = ($pkg1_base.$prv_ver_str.core.DataType.Time)dt;
				if(time.getTime() == null) {
					return "";
				} else {
					DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
					return time.getTime().format(hmsDtf);
				}
			} else {
				return "";
			}
		case FLOAT:
			if(dt instanceof ConsistentDataType.Float) {
				ConsistentDataType.Float fl0at = (ConsistentDataType.Float)dt;
				if(fl0at.getD0uble() == null) {
					return "";
				} else {
					return fl0at.getD0uble().toString();
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.Clazz.Float) {
				$pkg1_base.$prv_ver_str.core.Clazz.Float fl0at = ($pkg1_base.$prv_ver_str.core.Clazz.Float)dt;
				if(fl0at.getD0uble() == null) {
					return "";
				} else {
					return fl0at.getD0uble().toString();
				}
			} else {
				return "";
			}
		case INTEGER:
			if(dt instanceof ConsistentDataType.Integer) {
				ConsistentDataType.Integer integer = (ConsistentDataType.Integer)dt;
				if(integer.getL0ng() == null) {
					return "";
				} else {
					return integer.getL0ng().toString();
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.Clazz.Integer) {
				$pkg1_base.$prv_ver_str.core.Clazz.Integer integer = ($pkg1_base.$prv_ver_str.core.Clazz.Integer)dt;
				if(integer.getL0ng() == null) {
					return "";
				} else {
					return integer.getL0ng().toString();
				}
			} else {
				return "";
			}
		case NUMBER:
			if(dt instanceof ConsistentDataType.Number) {
				ConsistentDataType.Number number = (ConsistentDataType.Number)dt;
				if(number.getNumber() == null) {
					return "";
				} else {
					return number.getNumber().toString();
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.Number) {
				$pkg1_base.$prv_ver_str.core.DataType.Number number = ($pkg1_base.$prv_ver_str.core.DataType.Number)dt;
				if(number.getNumber() == null) {
					return "";
				} else {
					return number.getNumber().toString();
				}
			} else {
				return "";
			}
		case BOOLEAN:
			if(dt instanceof ConsistentDataType.Boolean) {
				ConsistentDataType.Boolean b00lean = (ConsistentDataType.Boolean)dt;
				if(b00lean.getB00lean() == null) {
					return "";
				} else {
					return b00lean.getB00lean().toString();
				}
			} else if(dt instanceof $pkg1_base.$prv_ver_str.core.DataType.Boolean) {
				$pkg1_base.$prv_ver_str.core.DataType.Boolean b00lean = ($pkg1_base.$prv_ver_str.core.DataType.Boolean)dt;
				if(b00lean.getB00lean() == null) {
					return "";
				} else {
					return b00lean.getB00lean().toString();
				}
			} else {
				return "";
			}
		default:
			return "";
		}
	}

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SimpleJsonWalker.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;
EoS
print FOUT << 'EoS';

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.kyojo.schemaorg.JsonOffsetElement.JsonArrayPhase;
import org.kyojo.schemaorg.JsonOffsetElement.JsonElementType;
import org.kyojo.schemaorg.JsonOffsetElement.JsonObjectPhase;

public class SimpleJsonWalker {

	private static final Log logger = LogFactory.getLog(SimpleJsonWalker.class);

	public static boolean breakDownJson(String json, JsonOffsetElement joe) {
		if(json == null) {
			logger.warn("null arg");
			return false;
		}

		int start = 0;
		for(; start < json.length(); start++) {
			char ch = json.charAt(start);
			if(!isMarginChar(ch)) {
				break;
			}
		}

		if(start == json.length()) {
			logger.warn("blank arg");
			return false;
		}

		int end = json.length() - 1;
		for(; end >= 0; end--) {
			char ch = json.charAt(end);
			if(!isMarginChar(ch)) {
				break;
			}
		}

		char ch = json.charAt(start);
		if(ch == '{') {
			return walkObject(json, start, joe);
		} else if(ch == '[') {
			return walkArray(json, start, joe);
		} else if(ch == '"') {
			return walkString(json, start, joe);
		} else {
			return walkValue(json, start, joe);
		}
	}

	private static boolean walkObject(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_OBJECT;
		joe.start = ofs;

		JsonOffsetElement child;
		JsonObjectPhase phase = JsonObjectPhase.LEFT;
		boolean keyIsId = false;
		boolean keyIsType = false;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(isMarginChar(ch)) {
				child = new JsonOffsetElement();
				if(!walkMargin(json, pos, child)) {
					return false;
				}
				pos = child.end;
				joe.children.add(child);
			} else if(ch == '}') {
				if(phase != JsonObjectPhase.LEFT && phase != JsonObjectPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				phase = JsonObjectPhase.RIGHT;
				joe.end = pos;
				break;
			} else if(ch == ':') {
				if(phase != JsonObjectPhase.KEY) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COLON;
				child.start = child.end = pos;
				phase = child.objectPhase = JsonObjectPhase.COLON;
				joe.children.add(child);
			} else if(ch == ',') {
				if(phase != JsonObjectPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COMMA;
				child.start = child.end = pos;
				phase = child.objectPhase = JsonObjectPhase.COMMA;
				joe.children.add(child);
				keyIsId = false;
				keyIsType = false;
			} else if(ch == '{') {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkObject(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			} else if(ch == '[') {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkArray(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			} else if(ch == '"') {
				if(phase != JsonObjectPhase.LEFT
						&& phase != JsonObjectPhase.COLON && phase != JsonObjectPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkString(json, pos, child)) {
					return false;
				}
				if(phase == JsonObjectPhase.COLON) {
					phase = child.objectPhase = JsonObjectPhase.VALUE;
					if(keyIsId) {
						joe.jsonLdId = json.substring(child.start + 1, child.end);
					} else if(keyIsType) {
						joe.jsonLdType = json.substring(child.start + 1, child.end);
					}
				} else {
					phase = child.objectPhase = JsonObjectPhase.KEY;
					String key = json.substring(child.start + 1, child.end);
					if(key.equals("@id")) {
						keyIsId = true;
					} else if(key.equals("@type")) {
						keyIsType = true;
					}
				}
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
			} else {
				if(phase != JsonObjectPhase.COLON) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkValue(json, pos, child)) {
					return false;
				}
				phase = child.objectPhase = JsonObjectPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				joe.lastValueIndex = joe.children.size() - 1;
			}
		}

		if(joe.end == null) {
			logger.warn("not terminated: pos=" + ofs + ", around=" + clipAround(json, ofs));
			return false;
		} else {
			return true;
		}
	}

	private static boolean walkArray(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_ARRAY;
		joe.start = ofs;

		JsonOffsetElement child;
		JsonArrayPhase phase = JsonArrayPhase.LEFT;
		boolean hasOnlyString = false;
		boolean notOnlyString = false;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(isMarginChar(ch)) {
				child = new JsonOffsetElement();
				if(!walkMargin(json, pos, child)) {
					return false;
				}
				pos = child.end;
				joe.children.add(child);
			} else if(ch == ']') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				phase = JsonArrayPhase.RIGHT;
				joe.end = pos;
				break;
			} else if(ch == ',') {
				if(phase != JsonArrayPhase.VALUE) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				child.type = JsonElementType.COMMA;
				child.start = child.end = pos;
				phase = child.arrayPhase = JsonArrayPhase.COMMA;
				joe.children.add(child);
			} else if(ch == '{') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkObject(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			} else if(ch == '[') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkArray(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			} else if(ch == '"') {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkString(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				hasOnlyString = true;
			} else {
				if(phase != JsonArrayPhase.LEFT && phase != JsonArrayPhase.COMMA) {
					logger.warn("invalid object: pos=" + pos + ", around=" + clipAround(json, pos));
					return false;
				}
				child = new JsonOffsetElement();
				if(!walkValue(json, pos, child)) {
					return false;
				}
				phase = child.arrayPhase = JsonArrayPhase.VALUE;
				pos = child.end;
				joe.children.add(child);
				if(joe.firstValueIndex == null) {
					joe.firstValueIndex = joe.children.size() - 1;
				}
				joe.lastValueIndex = joe.children.size() - 1;
				notOnlyString = true;
			}
		}
		joe.onlyString = hasOnlyString && !notOnlyString;

		if(joe.end == null) {
			logger.warn("not terminated: pos=" + ofs);
			return false;
		} else {
			return true;
		}
	}

	private static boolean walkString(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.V_STRING;
		joe.start = ofs;

		int escpCnt = 0;
		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(ch == '"' && escpCnt % 2 == 0) {
				joe.end = pos;
				joe.onlyString = true;
				return true;
			}
			if(ch == '\\') {
				escpCnt++;
			} else {
				escpCnt = 0;
			}
		}

		logger.warn("not terminated: pos=" + ofs + ", around=" + clipAround(json, ofs));
		return false;
	}

	private static Pattern numPt = Pattern.compile("\\-?\\d+(?:\\.\\d+|)(?:[eE][\\-\\+]?\\d+|)");

	private static boolean walkValue(String json, int ofs, JsonOffsetElement joe) {
		joe.start = ofs;

		if(json.length() - ofs >= 4) {
			String str = json.substring(ofs, ofs + 4);
			if(str.equals("false")) {
				joe.type = JsonElementType.V_FALSE;
			} else if(str.equals("null")) {
				joe.type = JsonElementType.V_NULL;
			} else if(str.equals("true")) {
				joe.type = JsonElementType.V_TRUE;
			}
			if(joe.type != null) {
				joe.end = ofs + 3;
				return true;
			}
		}

		Matcher numMc = numPt.matcher(json);
		numMc.region(ofs, json.length());
		if(numMc.lookingAt()) {
			joe.type = JsonElementType.V_NUMBER;
			joe.end = ofs + numMc.group().length() - 1;
			return true;
		}

		logger.warn("invalid value: pos=" + ofs + ", around=" + clipAround(json, ofs));
		return false;
	}

	private static boolean walkMargin(String json, int ofs, JsonOffsetElement joe) {
		joe.type = JsonElementType.MARGIN;
		joe.start = ofs;

		for(int pos = ofs + 1; pos < json.length(); pos++) {
			char ch = json.charAt(pos);
			if(!isMarginChar(ch)) {
				joe.end = pos - 1;
				break;
			}
		}

		if(joe.end == null) {
			joe.end = json.length() - 1;
		}
		return true;
	}

	public static boolean isMarginChar(char ch) {
		switch(ch) {
		case ' ':
		case '\t':
		case '\r':
		case '\n':
			return true;
		default:
			return false;
		}
	}

	public static String clipAround(String text, int pos) {
		final int LEN = 15;
		int begin = pos - LEN;
		if(begin < 0) begin = 0;
		int end = pos + LEN;
		if(end >= text.length()) end = text.length();
		return text.substring(begin, pos) + "!!here!!" + text.substring(pos, end);
	}

	/**
	 * Formats the given JSON string
	 *
	 * @param json the JSON string to format
	 * @param indent the indentation string per one depth
	 * @return JSON string
	 */
	public static String formatJson(String json, String indent) {
		JsonOffsetElement joe = new JsonOffsetElement();
		boolean res = breakDownJson(json, joe);
		if(res) {
			StringBuilder sb = new StringBuilder();
			formatJsonSub(json, joe, true, true, false, false, 0, "\t", sb);
			return sb.toString();
		} else {
			logger.warn("couldn't parse: " + json);
			return null;
		}
	}

	protected static void formatJsonSub(String json, JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(joe.children.size() == 0) {
			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, false, false, depth, indent, sb);
				sb.append(json.substring(joe.start, joe.end + 1));
				insertNewLine(joe, isFirst, isLast, false, false, depth, indent, sb);
			}
		} else {
			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, true, false, depth, indent, sb);
				int firstStart = joe.children.get(0).start;
				sb.append(json.substring(joe.start, firstStart));
				insertNewLine(joe, isFirst, isLast, true, false, depth, indent, sb);
			}

			int depthInc = 0;
			if(joe.type != JsonElementType.MARGIN) {
				depthInc++;
			}
			for(int ci = 0; ci < joe.children.size(); ci++) {
				JsonOffsetElement child = joe.children.get(ci);
				formatJsonSub(json, child,
						ci == joe.firstValueIndex, ci == joe.lastValueIndex,
						false, false, depth + depthInc, indent, sb);
			}

			if(joe.type != JsonElementType.MARGIN) {
				insertIndent(joe, isFirst, isLast, false, true, depth, indent, sb);
				int lastEnd = joe.children.get(joe.children.size() - 1).end;
				sb.append(json.substring(lastEnd + 1, joe.end + 1));
				insertNewLine(joe, isFirst, isLast, false, true, depth, indent, sb);
			}
		}
	}

	protected static void insertIndent(JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(indent == null) return;

		if(joe.objectPhase == JsonObjectPhase.COMMA
				|| joe.arrayPhase == JsonArrayPhase.COMMA) {
		} else if(!isRight && (joe.objectPhase == JsonObjectPhase.COLON
					|| joe.objectPhase == JsonObjectPhase.VALUE)) {
			sb.append(" ");
		} else {
			for(int ii = 0; ii < depth; ii++) {
				sb.append(indent);
			}
		}
	}

	protected static void insertNewLine(JsonOffsetElement joe,
			boolean isFirst, boolean isLast, boolean isLeft, boolean isRight,
			int depth, String indent, StringBuilder sb) {
		if(indent == null) return;

		if(joe.objectPhase == JsonObjectPhase.VALUE
				|| joe.arrayPhase == JsonArrayPhase.VALUE) {
			if(isLast || isLeft) {
				sb.append('\n');
				return;
			}
		} else if(joe.objectPhase != JsonObjectPhase.KEY
				&& joe.objectPhase != JsonObjectPhase.COLON) {
			sb.append('\n');
		}
	}

	public enum JsonLdThingStringGiven {
		AS_TEXT,
		AS_URL,
		AS_NAME,
		AS_INHERIT,
		AS_THING_NAME,
		AS_THING_URL,
		AS_THING_IDENTIFIER_TEXT,
		AS_THING_IDENTIFIER_URL
	}

	public enum JsonLdAtIdStringGiven {
		AS_TEXT,
		AS_URL,
		AS_AUTO
	}

	/**
	 * Converts the given JSON-Ld string to JSON
	 *
	 * @param jsonLd the JSON-Ld string to convert
	 * @param jsonLdRootMap the map to store JSON-Ld's key-values on the root
	 * @param thingStrModeMap the definition to interpret a string as schema.org's Thing subclasses
	 * @param atIdMode the definition to interpret JSON-Ld's {@literal @}id as schema.org's identifier property
	 * @return JSON string
	 */
	public static String jsonLdToJson(String jsonLd, Map<String, String> jsonLdRootMap,
			Map<String, JsonLdThingStringGiven> thingStrModeMap, JsonLdAtIdStringGiven atIdMode) {
		JsonOffsetElement joe = new JsonOffsetElement();
		boolean res = breakDownJson(jsonLd, joe);
		if(res) {
			if(joe.type != JsonElementType.V_OBJECT) {
				logger.warn("not object: " + jsonLd);
				return null;
			}

			StringBuilder sb = new StringBuilder();
			jsonLdToJsonSub(jsonLd, joe, jsonLdRootMap, null, thingStrModeMap, atIdMode, 0, sb);

			return sb.toString();
		} else {
			logger.warn("couldn't parse: " + jsonLd);
			return null;
		}
	}

	protected static void jsonLdToJsonSub(String jsonLd, JsonOffsetElement joe,
			Map<String, String> jsonLdRootMap, String parentKey,
			Map<String, JsonLdThingStringGiven> thingStrModeMap,
			JsonLdAtIdStringGiven atIdMode, int depth, StringBuilder sb) {
		if(joe.children.size() == 0) {
			if(joe.type != JsonElementType.MARGIN) {
				if(thingStrModeMap != null && parentKey != null
						&& thingStrModeMap.containsKey(parentKey)
						&& joe.type == JsonElementType.V_STRING
						&& (joe.objectPhase == JsonObjectPhase.VALUE)) {
					JsonLdThingStringGiven thingStrMode = thingStrModeMap.get(parentKey);
					int outer = 0;
					switch(thingStrMode) {
					case AS_THING_IDENTIFIER_TEXT:
					case AS_THING_IDENTIFIER_URL:
					case AS_THING_NAME:
						sb.append("{\"thing\":");
						outer++;
						break;
					default:
						break;
					}
					switch(thingStrMode) {
					case AS_THING_IDENTIFIER_TEXT:
					case AS_THING_IDENTIFIER_URL:
						sb.append("{\"identifier\":");
						outer++;
						break;
					default:
						break;
					}
					sb.append("{\"");
					switch(thingStrMode) {
					case AS_INHERIT:
						sb.append(parentKey);
						break;
					case AS_NAME:
					case AS_THING_NAME:
						sb.append("name");
						break;
					case AS_URL:
					case AS_THING_IDENTIFIER_URL:
						sb.append("url");
						break;
					case AS_TEXT:
					case AS_THING_IDENTIFIER_TEXT:
					default:
						sb.append("text");
						break;
					}
					sb.append("\":");
					sb.append(jsonLd.substring(joe.start, joe.end + 1));
					sb.append("}");
					for(int oi = 0; oi < outer; oi++) {
						sb.append("}");
					}
				} else {
					sb.append(jsonLd.substring(joe.start, joe.end + 1));
				}
			}
		} else {
			Map<String, List<Map<String, JsonOffsetElement>>> propListMap = null;
			Map<String, List<Map<String, String>>> propJsonLdMap = null;
			if(joe.type == JsonElementType.V_OBJECT) {
				if(joe.jsonLdType != null) {
					propListMap = new HashMap<>();
					propJsonLdMap = new HashMap<>();

					addJsonLdPropertyToJsonMap(jsonLd, joe, jsonLdRootMap,
							thingStrModeMap, atIdMode, depth + 1, propListMap, propJsonLdMap);
				}
			} else if(joe.type == JsonElementType.V_ARRAY) {
				for(JsonOffsetElement child : joe.children) {
					if(child.jsonLdType != null) {
						if(propListMap == null) {
							propListMap = new HashMap<>();
							propJsonLdMap = new HashMap<>();
						}

						addJsonLdPropertyToJsonMap(jsonLd, child, jsonLdRootMap,
								thingStrModeMap, atIdMode, depth + 1, propListMap, propJsonLdMap);
					}
				}
			}

			if(propListMap == null) {
				boolean jsonLdOnlyStringArray = false;
				if(parentKey != null && joe.type == JsonElementType.V_ARRAY
						&& joe.onlyString && thingStrModeMap.containsKey(parentKey)) {
					jsonLdOnlyStringArray = true;
					sb.append("{\"");
					switch(thingStrModeMap.get(parentKey)) {
					case AS_TEXT:
						sb.append("text");
						break;
					case AS_URL:
						sb.append("url");
						break;
					case AS_NAME:
						sb.append("name");
						break;
					case AS_INHERIT:
					default:
						sb.append(parentKey);
						break;
					}
					sb.append("\":");
				}

				if(joe.type != JsonElementType.MARGIN) {
					int firstStart = joe.children.get(0).start;
					sb.append(jsonLd.substring(joe.start, firstStart));
				}

				for(int ci = 0; ci < joe.children.size(); ci++) {
					JsonOffsetElement child = joe.children.get(ci);
					jsonLdToJsonSub(jsonLd, child, jsonLdRootMap, parentKey,
							thingStrModeMap, atIdMode, depth + 1, sb);
				}

				if(joe.type != JsonElementType.MARGIN) {
					int lastEnd = joe.children.get(joe.children.size() - 1).end;
					sb.append(jsonLd.substring(lastEnd + 1, joe.end + 1));
				}

				if(jsonLdOnlyStringArray) {
					sb.append("}");
				}
			} else {
				if(depth > 0) {
					sb.append("{");
				}

				int pc = 0;
				for(Entry<String, List<Map<String, JsonOffsetElement>>> propListEnt : propListMap.entrySet()) {
					pc++;

					String typeKey = propListEnt.getKey();
					List<Map<String, JsonOffsetElement>> childObjMapList = propListEnt.getValue();
					List<Map<String, String>> childJsonLdMapList = propJsonLdMap.get(typeKey);

					if(depth > 0) {
						sb.append("\"");
						sb.append(propListEnt.getKey());
						if(childObjMapList.size() > 1) {
							sb.append("List");
						}
						sb.append("\":");

						if(childObjMapList.size() > 1) {
							sb.append("[");
						}
					}

					int ec = 0;
					for(Map<String, JsonOffsetElement> childObjMap : childObjMapList) {
						Map<String, String> childJsonLdMap = childJsonLdMapList.get(ec);
						ec++;
						sb.append("{");

						int cc = 0;
						for(Map.Entry<String, JsonOffsetElement> childObjEnt : childObjMap.entrySet()) {
							cc++;
							String key = childObjEnt.getKey();
							JsonOffsetElement child = childObjEnt.getValue();

							sb.append("\"");
							sb.append(key);
							sb.append("\":");
							if(childJsonLdMap.containsKey(key)) {
								sb.append(childJsonLdMap.get(key));
							} else {
								jsonLdToJsonSub(jsonLd, child, jsonLdRootMap, key,
										thingStrModeMap, atIdMode, depth + 1, sb);
							}

							if(cc < childObjMap.size()) {
								sb.append(",");
							}
						}

						sb.append("}");
						if(ec < childObjMapList.size()) {
							sb.append(",");
						}
					}

					if(depth > 0 && childObjMapList.size() > 1) {
						sb.append("]");
					}

					if(pc < propListMap.size()) {
						sb.append(",");
					}
				}

				if(depth > 0) {
					sb.append("}");
				}
			}
		}
	}

	protected static boolean addJsonLdPropertyToJsonMap(String jsonLd,
			JsonOffsetElement joe, Map<String, String> jsonLdRootMap,
			Map<String, JsonLdThingStringGiven> thingStringModeMap,
			JsonLdAtIdStringGiven atIdMode, int depth,
			Map<String, List<Map<String, JsonOffsetElement>>> propListMap,
			Map<String, List<Map<String, String>>> propJsonLdMap) {
		Map<String, JsonOffsetElement> childObjMap = new HashMap<>();
		Map<String, String> childJsonLdMap = new HashMap<>();
		boolean keyIsId = false;
		boolean keyIsType = false;
		boolean keyIsJsonLd = false;
		String key = null;
		String idStr = null;
		String typeKey = null;
		for(JsonOffsetElement child : joe.children) {
			if(keyIsId) {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.VALUE) {
					String val = jsonLd.substring(child.start + 1, child.end);
					if(depth <= 1) {
						jsonLdRootMap.put(key, val);
					}
					JsonLdAtIdStringGiven mode = atIdMode;
					if(atIdMode == JsonLdAtIdStringGiven.AS_AUTO) {
						if(val.startsWith("http")) {
							mode = JsonLdAtIdStringGiven.AS_URL;
						} else {
							mode = JsonLdAtIdStringGiven.AS_TEXT;
						}
					}

					switch(mode) {
					case AS_URL:
						idStr = "{\"url\":\""
							+ SimpleJsonBuilder.escapeJson(val) + "\"}";
						break;
					case AS_TEXT:
					default:
						idStr = "{\"text\":\""
							+ SimpleJsonBuilder.escapeJson(val) + "\"}";
						break;
					}
					childObjMap.put("identifier", null);
					childJsonLdMap.put("identifier", idStr);
				} else if(child.type == JsonElementType.COMMA) {
					keyIsId = false;
				}
				continue;
			} else if(keyIsType) {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.VALUE) {
					String val = jsonLd.substring(child.start + 1, child.end);
					typeKey = Introspector.decapitalize(val);
					if(depth <= 1) {
						jsonLdRootMap.put(key, val);
					}
				} else if(child.type == JsonElementType.COMMA) {
					keyIsType = false;
				}
				continue;
			} else if(keyIsJsonLd) {
				if(depth <= 1) {
					if(child.type == JsonElementType.V_STRING
							&& child.objectPhase == JsonObjectPhase.VALUE) {
						String val = jsonLd.substring(child.start + 1, child.end);
						jsonLdRootMap.put(key, val);
					}
				}
				if(child.type == JsonElementType.COMMA) {
					keyIsJsonLd = false;
				}
				continue;
			} else {
				if(child.type == JsonElementType.V_STRING
						&& child.objectPhase == JsonObjectPhase.KEY) {
					key = jsonLd.substring(child.start + 1, child.end);
					// System.out.println(key + ": " + depth);
					if(key.equals("@id")) {
						keyIsId = true;
						continue;
					} else if(key.equals("@type")) {
						keyIsType = true;
						continue;
					} else if(key.startsWith("@")) {
						keyIsJsonLd = true;
						continue;
					}
				} else if(child.objectPhase == JsonObjectPhase.VALUE) {
					childObjMap.put(key, child);
				}
			}
		}

		if(typeKey == null) {
			// JSON-Ldと通常のJSONの混在はないはず
			return false;
		} else {
			List<Map<String, JsonOffsetElement>> childObjMapList = null;
			if(propListMap.containsKey(typeKey)) {
				childObjMapList = propListMap.get(typeKey);
			} else {
				childObjMapList = new ArrayList<>();
				propListMap.put(typeKey, childObjMapList);
			}
			childObjMapList.add(childObjMap);

			List<Map<String, String>> childJsonLdMapList = null;
			if(propJsonLdMap.containsKey(typeKey)) {
				childJsonLdMapList = propJsonLdMap.get(typeKey);
			} else {
				childJsonLdMapList = new ArrayList<>();
				propJsonLdMap.put(typeKey, childJsonLdMapList);
			}
			childJsonLdMapList.add(childJsonLdMap);

			return true;
		}
	}

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'JsonOffsetElement.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;
EoS
print FOUT << 'EoS';

import java.util.LinkedList;
import java.util.List;

public class JsonOffsetElement {

	public JsonElementType type;
	public Integer start;
	public List<JsonOffsetElement> children = new LinkedList<>();
	public Integer firstValueIndex;
	public Integer lastValueIndex;
	public Integer end;
	public JsonObjectPhase objectPhase;
	public JsonArrayPhase arrayPhase;
	public String jsonLdId;
	public String jsonLdType;
	public boolean onlyString;

	public enum JsonElementType {
		MARGIN,
		V_FALSE,
		V_NULL,
		V_TRUE,
		V_OBJECT,
		V_ARRAY,
		V_NUMBER,
		V_STRING,
		COLON,
		COMMA
	}

	public enum JsonObjectPhase {
		LEFT,
		KEY,
		COLON,
		VALUE,
		COMMA,
		RIGHT
	}

	public enum JsonArrayPhase {
		LEFT,
		VALUE,
		COMMA,
		RIGHT
	}

}
EoS
close FOUT;

$out_fpath = $out1_dpath . 'SimpleJsonBuilder.java';
open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
binmode (FOUT, ':utf8');
print FOUT << "EoS";
package $pkg1_base;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import $pkg1_base.JsonListIndex;
import $pkg1_base.JsonListNo;
EoS
print FOUT << 'EoS';

/**
 * This class is the JSON builder for JSONizing schemeOrg objects.
 * It is added functions internally no other general JSON builders provide,
 * but enough available as a simple JSON builder for any purpose.
 */
public class SimpleJsonBuilder {

	private static final Log logger = LogFactory.getLog(SimpleJsonBuilder.class);

	private static Pattern cmlPt1 = Pattern.compile("[A-Z]+");
	private static Pattern cmlPt2 = Pattern.compile("([A-Z]+)([A-Z].*)");
	private static Pattern cmlPt3 = Pattern.compile("([A-Z])(.*)");
	private static final int DEPTH_LIMIT = 100;

	public static List<Field> getAllFields(Class<?> type) {
		List<Field> flds = new ArrayList<>();
		for(Class<?> cls = type; cls != null; cls = cls.getSuperclass()) {
			flds.addAll(Arrays.asList(cls.getDeclaredFields()));
		}
		return flds;
	}

	/**
	 * Serializes the given object to JSON
	 *
	 * @param obj the object to serialize
	 * @return JSON string
	 */
	public static String toJson(Object obj) {
		return toJson(obj, obj.getClass());
	}

	/**
	 * Serializes the given object to JSON
	 *
	 * @param obj the object to serialize
	 * @param cls the specified object class
	 * @return JSON string
	 */
	public static String toJson(Object obj, Class<?> cls) {
		logger.debug("class: " + cls.getName());
		String json = toJson(obj, cls, null, 0, new LinkedList<>(), false);
		logger.debug("json: " + json);
		return json;
	}

	/**
	 * Serializes the given object to JSON-LD
	 *
	 * @param obj the object to serialize
	 * @return JSON string
	 */
	public static String toJsonLd(Object obj) {
		return toJsonLd(obj, obj.getClass());
	}

	/**
	 * Serializes the given object to JSON-LD
	 *
	 * @param obj the object to serialize
	 * @param cls the specified object class
	 * @return JSON string
	 */
	public static String toJsonLd(Object obj, Class<?> cls) {
		logger.debug("class: " + cls.getName());
		String jsonLd = toJson(obj, cls, null, 0, new LinkedList<>(), true);
		logger.debug("jsonLd: " + jsonLd);
		return jsonLd;
	}

	private static String toJson(Object obj, Class<?> cls, Integer idx,
			int depth, LinkedList<Object> stack, boolean isJsonLd) {
		stack.addFirst(obj);
		String valStr1 = toValStr(obj, cls);
		if(valStr1 != null) {
			logger.trace(cls.getName() + " -> " + valStr1);
			return valStr1;
		}

		Map<String, String> jsonLdStrMap = new HashMap<>();
		if(isJsonLd) {
			JsonLdContext jsonLdContext = cls.getAnnotation(JsonLdContext.class);
			if(jsonLdContext != null) {
				jsonLdStrMap.put("@context", jsonLdContext.value());
			}

			SchemaOrgLabel schemaOrgLabel = cls.getAnnotation(SchemaOrgLabel.class);
			if(schemaOrgLabel != null) {
				jsonLdStrMap.put("@type", schemaOrgLabel.value());
			}
		}

		boolean isJsonLdProperty = false;
		if(isJsonLd && SchemaOrgProperty.class.isAssignableFrom(cls)) {
			isJsonLdProperty = true;
		}

		StringBuilder sb = null;
		if(cls.isArray() && cls.getComponentType().equals(byte.class)) {
			sb = new StringBuilder("null");
			return sb.toString();
		} else if(cls.isArray() || List.class.isAssignableFrom(cls)) {
			List<?> list = cls.isArray() ? Arrays.asList(obj) : (List<?>)obj;
			sb = new StringBuilder("[");
			for(int li = 0; li < list.size(); li++) {
				Object le = list.get(li);
				if(le == null) {
					sb.append("null");
				} else {
					boolean loop = false;
					for(Object to : stack) {
						if(to.equals(le)) {
							loop = true;
							break;
						}
					}
					if(loop) {
						sb.append("null");
						logger.warn("object looping:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else if(depth == DEPTH_LIMIT) {
						sb.append("null");
						logger.warn("depth limit over:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") " + to.toString()));
					} else {
						// ToDo: le.getClass()は意図した型が取れないかもしれないがしかたないか
						sb.append(toJson(le, le.getClass(), li, depth + 1, new LinkedList<>(stack), isJsonLd));
					}
				}
				if(li < list.size() - 1) {
					sb.append(",");
				}
			}
			sb.append("]");
			return sb.toString();
		} else if(Map.class.isAssignableFrom(cls)) {
			Map<?, ?> map = (Map<?, ?>)obj;
			sb = new StringBuilder("{");
			int mi = 0;
			for(Map.Entry<?, ?> ent : map.entrySet()) {
				Object val = ent.getValue();
				sb.append("\"");
				sb.append(escapeJson(ent.getKey().toString()));
				sb.append("\":");
				if(val == null) {
					sb.append("null");
				} else {
					boolean loop = false;
					for(Object to : stack) {
						if(to.equals(val)) {
							loop = true;
							break;
						}
					}
					if(loop) {
						sb.append("null");
						logger.warn("object looping:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
					} else if(depth == DEPTH_LIMIT) {
						sb.append("null");
						logger.warn("depth limit over:");
						stack.forEach(to -> logger.warn(" (" + to.getClass() + ") " + to.toString()));
					} else {
						// ToDo: val.getClass()は意図した型が取れないかもしれないがしかたないか
						sb.append(toJson(val, val.getClass(), null, depth + 1, new LinkedList<>(stack), isJsonLd));
					}
				}

				if(mi < map.size() - 1) {
					sb.append(",");
				}
				mi++;
			}
			sb.append("}");
			return sb.toString();
		}

		// パラメータ名称の決定
		List<Field> dclFlds = getAllFields(cls);
		HashMap<String, Field> lcDclFldNameMap = new HashMap<>();
		HashMap<String, Field> lcExcldFldNameMap = new HashMap<>(); // Groovyのget/set自動生成のため必要
		Field listIndexFld = null;
		Field listNoFld = null;
		Object listIndexVal = null;
		Object listNoVal = null;
		for(Field dclFld : dclFlds) {
			String dfn = dclFld.getName().toLowerCase();
			if(lcDclFldNameMap.containsKey(dfn)) {
				// 下位クラスのフィールドを優先
				continue;
			}

			int modifier = dclFld.getModifiers();
			if(Modifier.isFinal(modifier)
					|| Modifier.isStatic(modifier) || Modifier.isTransient(modifier)
					|| Modifier.isVolatile(modifier)) {
				lcExcldFldNameMap.put(dfn, dclFld);
				continue;
			}
			if(!dclFld.getName().equals("class") && !dclFld.getName().equals("nativeValue")
					&& !dclFld.getName().equals("property") && !dclFld.getName().equals("metaClass")
					&& !dclFld.getName().equals("serialVersionUID")
					&& !dclFld.getName().equals("logger") && !dclFld.getName().equals("thisClass")
					&& !dclFld.getName().startsWith("_") && !dclFld.getName().startsWith("$")) {
				lcDclFldNameMap.put(dfn, dclFld);
			} else {
				lcExcldFldNameMap.put(dfn, dclFld);
			}

			if(idx != null) {
				if(dclFld.isAnnotationPresent(JsonListIndex.class)) {
					if(Integer.class.isAssignableFrom(dclFld.getType())
							|| int.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = idx;
					} else if(Long.class.isAssignableFrom(dclFld.getType())
							|| long.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = idx.longValue();
					} else if(String.class.isAssignableFrom(dclFld.getType())) {
						listIndexFld = dclFld;
						listIndexVal = "" + idx;
					}
				} else if(dclFld.isAnnotationPresent(JsonListNo.class)) {
					if(Integer.class.isAssignableFrom(dclFld.getType())
							|| int.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = new Integer(idx + 1);
					} else if(Long.class.isAssignableFrom(dclFld.getType())
							|| long.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = new Long(idx.longValue() + 1L);
					} else if(String.class.isAssignableFrom(dclFld.getType())) {
						listNoFld = dclFld;
						listNoVal = "" + (idx + 1);
					}
				}
			}
		}

		Method[] mtds = cls.getMethods();
		HashMap<String, Method> lcGetMtdNameMap = new HashMap<>();
		HashMap<String, Method> tmpMtdMap = new HashMap<>();
		Method listIndexMtd = null;
		Method listNoMtd = null;
		for(Method mtd : mtds) {
			int modifier = mtd.getModifiers();
			if(Modifier.isFinal(modifier)
					|| Modifier.isStatic(modifier) || Modifier.isTransient(modifier)
					|| Modifier.isVolatile(modifier)) {
				continue;
			}
			if(mtd.getName().length() > 3 && (mtd.getName().startsWith("get") || mtd.getName().startsWith("set"))) {
				tmpMtdMap.put(mtd.getName(), mtd);
			}
		}
		for(Method mtd : tmpMtdMap.values()) {
			if(mtd.getName().startsWith("get")
					&& mtd.getParameterTypes().length == 0
					&& !mtd.getName().equals("getClass") && !mtd.getName().equals("getNativeValue")
					&& !mtd.getName().equals("getProperty") && !mtd.getName().equals("getMetaClass")
					&& !mtd.getName().equals("getThisClass")) {
				String prmName = mtd.getName().substring(3);
				if(tmpMtdMap.containsKey("set" + prmName)) {
					String lcGetMtdName = prmName.toLowerCase();
					if(!lcExcldFldNameMap.containsKey(lcGetMtdName)) {
						lcGetMtdNameMap.put(lcGetMtdName, mtd);
					}

					if(idx != null) {
						if((mtd.isAnnotationPresent(JsonListIndex.class)
									|| (listIndexFld != null
										&& listIndexFld.getName().equalsIgnoreCase(prmName)))) {
							if(Integer.class.isAssignableFrom(mtd.getReturnType())
									|| int.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = idx;
								listIndexFld = null;
							} else if(Long.class.isAssignableFrom(mtd.getReturnType())
									|| long.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = idx.longValue();
								listIndexFld = null;
							} else if(String.class.isAssignableFrom(mtd.getReturnType())) {
								listIndexMtd = mtd;
								listIndexVal = "" + idx;
								listIndexFld = null;
							}
						} else if((mtd.isAnnotationPresent(JsonListNo.class)
									|| (listNoFld != null
										&& listNoFld.getName().equalsIgnoreCase(prmName)))) {
							if(Integer.class.isAssignableFrom(mtd.getReturnType())
									|| int.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = new Integer(idx + 1);
								listNoFld = null;
							} else if(Long.class.isAssignableFrom(mtd.getReturnType())
									|| long.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = new Long(idx.longValue() + 1L);
								listNoFld = null;
							} else if(String.class.isAssignableFrom(mtd.getReturnType())) {
								listNoMtd = mtd;
								listNoVal = "" + (idx + 1);
								listNoFld = null;
							}
						}
					}
				}
			}
		}

		if(SchemaOrgClass.class.isAssignableFrom(cls)) {
			// クラス型のstringはnameと同じなのでJSON出力時は省略
			if(lcDclFldNameMap.containsKey("name") || lcGetMtdNameMap.containsKey("name")) {
				lcDclFldNameMap.remove("string");
				lcGetMtdNameMap.remove("string");
			}
		}

		// Listと単一オブジェクトが共存しているものを統合
		Map<String, Field> colistFldNameMap = new HashMap<>();
		Map<String, Method> colistMtdNameMap = new HashMap<>();
		try {
			for(Map.Entry<String, Field> ent : lcDclFldNameMap.entrySet()) {
				String lcDclFldNameList = ent.getKey();
				if(lcDclFldNameList.endsWith("list")) {
					String lcDclFldNameObj = lcDclFldNameList.substring(0, lcDclFldNameList.length() - 4);
					if(lcDclFldNameMap.containsKey(lcDclFldNameObj)) {
						// Comment,Reviewの特例を考え型チェックを入れない
						// Field fldObj = lcDclFldNameMap.get(lcDclFldNameObj);
						// Class<?> objCls = fldObj.getType();
						Field fldList = ent.getValue();
						// ParameterizedType gType = (ParameterizedType)fldList.getGenericType();
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistFldNameMap.put(lcDclFldNameObj, fldList);
						// }
					}
					if(lcGetMtdNameMap.containsKey(lcDclFldNameObj)) {
						// Method mtdObj = lcGetMtdNameMap.get(lcDclFldNameObj);
						// Class<?> objCls = mtdObj.getReturnType();
						Field fldList = ent.getValue();
						// ParameterizedType gType = (ParameterizedType)fldList.getGenericType();
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistFldNameMap.put(lcDclFldNameObj, fldList);
						// }
					}
				}
			}
			for(Map.Entry<String, Method> ent : lcGetMtdNameMap.entrySet()) {
				String lcGetMtdNameList = ent.getKey();
				if(lcGetMtdNameList.endsWith("list")) {
					String lcGetMtdNameObj = lcGetMtdNameList.substring(0, lcGetMtdNameList.length() - 4);
					if(lcGetMtdNameMap.containsKey(lcGetMtdNameObj)) {
						// Method mtdObj = lcGetMtdNameMap.get(lcGetMtdNameObj);
						// Class<?> objCls = mtdObj.getReturnType();
						Method mtdList = ent.getValue();
						// Type type = mtdList.getGenericReturnType();
						// ParameterizedType gType = (ParameterizedType)type;
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistMtdNameMap.put(lcGetMtdNameObj, mtdList);
						// }
					}
					if(lcDclFldNameMap.containsKey(lcGetMtdNameObj)) {
						// Field fldObj = lcDclFldNameMap.get(lcGetMtdNameObj);
						// Class<?> objCls = fldObj.getType();
						Method mtdList = ent.getValue();
						// Type type = mtdList.getGenericReturnType();
						// ParameterizedType gType = (ParameterizedType)type;
						// Type[] aTypes = gType.getActualTypeArguments();
						// Class<?> listCls = (Class<?>)aTypes[0];
						// if(objCls.equals(listCls)) {
							colistMtdNameMap.put(lcGetMtdNameObj, mtdList);
						// }
					}
				}
			}
			for(Map.Entry<String, Field> ent : colistFldNameMap.entrySet()) {
				String colistFldName = ent.getKey();
				Field fld = ent.getValue();
				fld.setAccessible(true);
				List<?> list = (List<?>)fld.get(obj);
				if(list != null && list.size() > 1) {
					lcDclFldNameMap.put(colistFldName, fld);
				}
				lcDclFldNameMap.remove(colistFldName + "list");
			}
			for(Map.Entry<String, Method> ent : colistMtdNameMap.entrySet()) {
				String colistMtdName = ent.getKey();
				Method mtd = ent.getValue();
				List<?> list = (List<?>)mtd.invoke(obj);
				if(list != null && list.size() > 1) {
					lcGetMtdNameMap.put(colistMtdName, mtd);
				}
				lcGetMtdNameMap.remove(colistMtdName + "list");
			}
		} catch(IllegalArgumentException iae) {
		} catch(IllegalAccessException iae) {
		} catch(InvocationTargetException ite) {
		}

		if(isJsonLdProperty) {
			try {
				// 実装が Action->agent->Person->* みたいになっている。PersonがJSON-LDに書かれないようにする。
				List<String> names = new ArrayList<>();
				for(String name : lcGetMtdNameMap.keySet()) {
					names.add(name);
				}
				for(String name : lcDclFldNameMap.keySet()) {
					if(!lcGetMtdNameMap.containsKey(name)) {
						names.add(name);
					}
				}
				Collections.sort(names);

				List<Object> valList = new ArrayList<>();
				List<Class<?>> clsList = new ArrayList<>();
				for(String name : names) {
					Object sv;
					Class<?> sc;
					boolean isList = false;
					if(lcGetMtdNameMap.containsKey(name)) {
						Method mtd = lcGetMtdNameMap.get(name);
						sv = mtd.invoke(obj);
						if(sv == null) {
							continue;
						}
						sc = mtd.getReturnType();
						if(List.class.isAssignableFrom(sc)) {
							Type type = mtd.getGenericReturnType();
							ParameterizedType gType = (ParameterizedType)type;
							Type[] aTypes = gType.getActualTypeArguments();
							if(aTypes.length > 0 && aTypes[0] instanceof Class) {
								sc = (Class<?>)aTypes[0];
								isList = true;
							}
						}
					} else {
						Field fld = lcDclFldNameMap.get(name);
						fld.setAccessible(true);
						sv = fld.get(obj);
						if(sv == null) {
							continue;
						}
						sc = fld.getType();
						if(List.class.isAssignableFrom(sc)) {
							ParameterizedType gType = (ParameterizedType)fld.getGenericType();
							Type[] aTypes = gType.getActualTypeArguments();
							if(aTypes.length > 0 && aTypes[0] instanceof Class) {
								sc = (Class<?>)aTypes[0];
								isList = true;
							}
						}
					}
					if(isList) {
						List<?> tmpList = (List<?>)sv;
						valList.addAll(tmpList);
						for(int ti = 0; ti < tmpList.size(); ti++) {
							clsList.add(sc);
						}
					} else {
						valList.add(sv);
						clsList.add(sc);
					}
				}

				if(valList.size() == 0) {
					return "null";
				} else {
					if(valList.size() > 1) {
						sb = new StringBuilder("[");
					} else {
						sb = new StringBuilder();
					}
					for(int ri = 0; ri < valList.size(); ri++) {
						Object rv = valList.get(ri);
						Class<?> rc = clsList.get(ri);
						String valStr = toValStr(rv, rc);
						appendWithCheck(rv, rc, ri, valStr, sb, depth, stack, isJsonLd);
						if(ri < valList.size() - 1) {
							sb.append(",");
						}
					}
					if(valList.size() > 1) {
						sb.append("]");
					}
					return sb.toString();
				}
			} catch(IllegalArgumentException iae) {
			} catch(IllegalAccessException iae) {
			} catch(InvocationTargetException ite) {
			}
		}

		HashMap<String, Method> prmMtdNameMap = new HashMap<>();
		HashMap<String, Field> prmFldNameMap = new HashMap<>();
		for(Map.Entry<String, Method> ent : lcGetMtdNameMap.entrySet()) {
			String lcGetMtdName = ent.getKey();
			Method mtd = ent.getValue();
			// 対応するフィールドがあれば名称にする
			if(lcDclFldNameMap.containsKey(lcGetMtdName)) {
				prmMtdNameMap.put(lcDclFldNameMap.get(lcGetMtdName).getName(), mtd);
				continue;
			}

			// アノテーションでキャメルケースが指定されていれば名称にする
			if(List.class.isAssignableFrom(mtd.getReturnType())) {
				Type type = mtd.getGenericReturnType();
				ParameterizedType gType = (ParameterizedType)type;
				Type[] aTypes = gType.getActualTypeArguments();
				if(aTypes.length > 0 && aTypes[0] instanceof Class) {
					Class<?> rtnCls = (Class<?>)aTypes[0];
					CamelizedName cmlName = rtnCls.getAnnotation(CamelizedName.class);
					if(cmlName != null) {
						prmMtdNameMap.put(cmlName.value() + "List", mtd);
						continue;
					}
				}
			} else {
				CamelizedName cmlName = mtd.getReturnType().getAnnotation(CamelizedName.class);
				if(cmlName != null) {
					prmMtdNameMap.put(cmlName.value(), mtd);
					continue;
				}
			}

			// メソッド名から生成する
			String getMtdName = mtd.getName().substring(3);
			Matcher cmlMc1 = cmlPt1.matcher(getMtdName);
			if(cmlMc1.matches()) {
				prmMtdNameMap.put(getMtdName.toLowerCase(), mtd);
				continue;
			}
			Matcher cmlMc2 = cmlPt2.matcher(getMtdName);
			if(cmlMc2.matches()) {
				prmMtdNameMap.put(cmlMc2.group(1).toLowerCase() + cmlMc2.group(2), mtd);
				continue;
			}
			Matcher cmlMc3 = cmlPt3.matcher(getMtdName);
			if(cmlMc3.matches()) {
				prmMtdNameMap.put(cmlMc3.group(1).toLowerCase() + cmlMc3.group(2), mtd);
				continue;
			}
		}
		for(Map.Entry<String, Field> ent : lcDclFldNameMap.entrySet()) {
			if(!lcGetMtdNameMap.containsKey(ent.getKey())) {
				prmFldNameMap.put(ent.getValue().getName(), ent.getValue());
			}
		}

		HashMap<String, Method> jsonLdMtdMap = new HashMap<>();
		HashMap<String, Field> jsonLdFldMap = new HashMap<>();
		if(isJsonLd) {
			// identifierは@idと解釈する
			if(prmMtdNameMap.containsKey("identifier")) {
				Method mtd = prmMtdNameMap.get("identifier");
				jsonLdMtdMap.put("@id", mtd);
				prmMtdNameMap.remove("identifier");
			} else if(prmFldNameMap.containsKey("identifier")) {
				Field fld = prmFldNameMap.get("identifier");
				jsonLdFldMap.put("@id", fld);
				prmFldNameMap.remove("identifier");
			}
		}

		// 出力パラメータに関して繰り返し
		List<String> prmNameList = new ArrayList<String>();
		for(Map.Entry<String, Method> ent : prmMtdNameMap.entrySet()) {
			prmNameList.add(ent.getKey());
		}
		for(Map.Entry<String, Field> ent : prmFldNameMap.entrySet()) {
			prmNameList.add(ent.getKey());
		}
		if(isJsonLd) {
			for(Map.Entry<String, Method> ent : jsonLdMtdMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
			for(Map.Entry<String, Field> ent : jsonLdFldMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
			for(Map.Entry<String, String> ent : jsonLdStrMap.entrySet()) {
				prmNameList.add(ent.getKey());
			}
		}
		Collections.sort(prmNameList);
		sb = new StringBuilder("{");
		int notNullCnt = 0;
		for(int pi = 0; pi < prmNameList.size(); pi++) {
			String prmName = prmNameList.get(pi);
			logger.trace("param: " + prmName);

			try {
				Object rv = null;
				Class<?> rc = null;
				if(prmMtdNameMap.containsKey(prmName)) {
					Method mtd = prmMtdNameMap.get(prmName);
					logger.trace("method: " + mtd);
					if(idx != null && listIndexMtd != null && listIndexMtd.equals(mtd)) {
						rv = listIndexVal;
					} else if(idx != null && listNoMtd != null && listNoMtd.equals(mtd)) {
						rv = listNoVal;
					} else {
						rv = mtd.invoke(obj);
					}
					rc = mtd.getReturnType();
				} else if(prmFldNameMap.containsKey(prmName)) {
					Field fld = prmFldNameMap.get(prmName);
					logger.trace("field: " + fld);
					fld.setAccessible(true);
					if(idx != null && listIndexFld != null && listIndexFld.equals(fld)) {
						rv = listIndexVal;
					} else if(idx != null && listNoFld != null && listNoFld.equals(fld)) {
						rv = listNoVal;
					} else {
						rv = fld.get(obj);
					}
					rc = fld.getType();
				} else {
					if(jsonLdMtdMap.containsKey(prmName)) {
						Method mtd = jsonLdMtdMap.get(prmName);
						logger.trace("method: " + mtd);
						rv = mtd.invoke(obj);
						rc = mtd.getReturnType();
					} else if(jsonLdFldMap.containsKey(prmName)) {
						Field fld = jsonLdFldMap.get(prmName);
						logger.trace("field: " + fld);
						fld.setAccessible(true);
						rv = fld.get(obj);
						rc = fld.getType();
					} else {
						rv = jsonLdStrMap.get(prmName);
						rc = String.class;
					}
				}
				if(rv == null) {
					// sb.append("null");
					continue;
				}

				String valStr2 = toValStr(rv, rc);
				if(valStr2 != null && valStr2.equals("null")) {
					continue;
				}
				notNullCnt++;

				if(notNullCnt > 1) {
					sb.append(",");
				}
				sb.append("\"");
				sb.append(escapeJson(prmName));
				sb.append("\"");
				sb.append(":");
				appendWithCheck(rv, rc, null, valStr2, sb, depth, stack, isJsonLd);
			} catch(Exception ex) {
				// sb.append("\"");
				// sb.append(escapeJson(ex.toString()));
				// sb.append("\"");
				logger.warn(ex.getMessage(), ex);
				logger.warn("objects trace:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") " + to.toString()));
			}
		}
		sb.append("}");

		return sb.toString();
	}

	private static void appendWithCheck(Object rv, Class<?> rc, Integer ri, String valStr, StringBuilder sb,
			int depth, LinkedList<Object> stack, boolean isJsonLd) {
		if(valStr == null) {
			boolean loop = false;
			for(Object to : stack) {
				if(to.equals(rv)) {
					loop = true;
					break;
				}
			}
			if(loop) {
				sb.append("null");
				logger.warn("object looping:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") "));
			} else if(depth == DEPTH_LIMIT) {
				sb.append("null");
				logger.warn("depth limit over:");
				stack.forEach(to -> logger.warn(" (" + to.getClass() + ") " + to.toString()));
			} else {
				sb.append(toJson(rv, rc, ri, depth + 1, new LinkedList<>(stack), isJsonLd));
			}
		} else {
			sb.append(valStr);
		}
	}
EoS
print FOUT << "EoS";

	private static String toValStr(Object rv, Class<?> rc) {
		StringBuilder sb = new StringBuilder();
		if(rv == null) {
			return "null";
		} else if(String.class.isAssignableFrom(rc)) {
			sb.append("\\"");
			sb.append(escapeJson((String)rv));
			sb.append("\\"");
		} else if(Boolean.class.isAssignableFrom(rc) || boolean.class.isAssignableFrom(rc)) {
			sb.append(rv.toString());
		} else if(Number.class.isAssignableFrom(rc) || int.class.isAssignableFrom(rc)
				|| long.class.isAssignableFrom(rc) || double.class.isAssignableFrom(rc)
				|| char.class.isAssignableFrom(rc) || byte.class.isAssignableFrom(rc)
				|| short.class.isAssignableFrom(rc) || float.class.isAssignableFrom(rc)) {
			sb.append(rv.toString());
		} else if(OffsetDateTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
			OffsetDateTime odt = (OffsetDateTime)rv;
			sb.append("\\"");
			sb.append(odt.format(ymdhmszDtf));
			sb.append("\\"");
		} else if(LocalDateTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdhmsDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
			LocalDateTime ldt = (LocalDateTime)rv;
			sb.append("\\"");
			sb.append(ldt.format(ymdhmsDtf));
			sb.append("\\"");
		} else if(OffsetTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter hmszDtf = DateTimeFormatter.ofPattern("HH:mm:ssXXX");
			OffsetTime ot = (OffsetTime)rv;
			sb.append("\\"");
			sb.append(ot.format(hmszDtf));
			sb.append("\\"");
		} else if(LocalDate.class.isAssignableFrom(rc)) {
			DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate ld = (LocalDate)rv;
			sb.append("\\"");
			sb.append(ld.format(ymdDtf));
			sb.append("\\"");
		} else if(LocalTime.class.isAssignableFrom(rc)) {
			DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime lt = (LocalTime)rv;
			sb.append("\\"");
			sb.append(lt.format(hmsDtf));
			sb.append("\\"");
		} else if(Calendar.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdhmszSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
			Calendar cal = (Calendar)rv;
			java.util.Date date = cal.getTime();
			TimeZone tz = cal.getTimeZone();
			ymdhmszSdf.setTimeZone(tz);
			sb.append("\\"");
			sb.append(ymdhmszSdf.format(date));
			sb.append("\\"");
		} else if(java.sql.Date.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdSdf = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date date = (java.sql.Date)rv;
			sb.append("\\"");
			sb.append(ymdSdf.format(date));
			sb.append("\\"");
		} else if(java.sql.Time.class.isAssignableFrom(rc)) {
			SimpleDateFormat hmsSdf = new SimpleDateFormat("HH:mm:ss");
			java.sql.Time time = (java.sql.Time)rv;
			sb.append("\\"");
			sb.append(hmsSdf.format(time));
			sb.append("\\"");
		} else if(java.util.Date.class.isAssignableFrom(rc)) {
			SimpleDateFormat ymdhmsSdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			java.util.Date date = (java.util.Date)rv;
			sb.append("\\"");
			sb.append(ymdhmsSdf.format(date));
			sb.append("\\"");
		} else if(ConsistentDataType.Text.class.isAssignableFrom(rc)) {
			sb.append("\\"");
			sb.append(escapeJson(((ConsistentDataType.Text)rv).getString()));
			sb.append("\\"");
		} else if($pkg1_base.$prv_ver_str.core.DataType.Text.class.isAssignableFrom(rc)) {
			sb.append("\\"");
			sb.append(escapeJson((($pkg1_base.$prv_ver_str.core.DataType.Text)rv).getString()));
			sb.append("\\"");
		} else if(ConsistentDataType.Boolean.class.isAssignableFrom(rc)) {
			sb.append(((ConsistentDataType.Boolean)rv).getB00lean().toString());
		} else if($pkg1_base.$prv_ver_str.core.DataType.Boolean.class.isAssignableFrom(rc)) {
			sb.append((($pkg1_base.$prv_ver_str.core.DataType.Boolean)rv).getB00lean().toString());
		} else if(ConsistentDataType.DateTime.class.isAssignableFrom(rc)) {
			ConsistentDataType.DateTime dateTime = (ConsistentDataType.DateTime)rv;
			OffsetDateTime odt = dateTime.getDateTime();
			if(odt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
				sb.append("\\"");
				sb.append(odt.format(ymdhmszDtf));
				sb.append("\\"");
			}
		} else if($pkg1_base.$prv_ver_str.core.DataType.DateTime.class.isAssignableFrom(rc)) {
			$pkg1_base.$prv_ver_str.core.DataType.DateTime dateTime = ($pkg1_base.$prv_ver_str.core.DataType.DateTime)rv;
			OffsetDateTime odt = dateTime.getDateTime();
			if(odt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdhmszDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
				sb.append("\\"");
				sb.append(odt.format(ymdhmszDtf));
				sb.append("\\"");
			}
		} else if(ConsistentDataType.Date.class.isAssignableFrom(rc)) {
			ConsistentDataType.Date date = (ConsistentDataType.Date)rv;
			LocalDate ld = date.getDate();
			if(ld == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				sb.append("\\"");
				sb.append(ld.format(ymdDtf));
				sb.append("\\"");
			}
		} else if($pkg1_base.$prv_ver_str.core.DataType.Date.class.isAssignableFrom(rc)) {
			$pkg1_base.$prv_ver_str.core.DataType.Date date = ($pkg1_base.$prv_ver_str.core.DataType.Date)rv;
			LocalDate ld = date.getDate();
			if(ld == null) {
				sb.append("null");
			} else {
				DateTimeFormatter ymdDtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				sb.append("\\"");
				sb.append(ld.format(ymdDtf));
				sb.append("\\"");
			}
		} else if(ConsistentDataType.Time.class.isAssignableFrom(rc)) {
			ConsistentDataType.Time time = (ConsistentDataType.Time)rv;
			LocalTime lt = time.getTime();
			if(lt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				sb.append("\\"");
				sb.append(lt.format(hmsDtf));
				sb.append("\\"");
			}
		} else if($pkg1_base.$prv_ver_str.core.DataType.Time.class.isAssignableFrom(rc)) {
			$pkg1_base.$prv_ver_str.core.DataType.Time time = ($pkg1_base.$prv_ver_str.core.DataType.Time)rv;
			LocalTime lt = time.getTime();
			if(lt == null) {
				sb.append("null");
			} else {
				DateTimeFormatter hmsDtf = DateTimeFormatter.ofPattern("HH:mm:ss");
				sb.append("\\"");
				sb.append(lt.format(hmsDtf));
				sb.append("\\"");
			}
		} else if(ConsistentDataType.Number.class.isAssignableFrom(rc)) {
			sb.append(((ConsistentDataType.Number)rv).getNumber().toString());
		} else if($pkg1_base.$prv_ver_str.core.DataType.Number.class.isAssignableFrom(rc)) {
			sb.append((($pkg1_base.$prv_ver_str.core.DataType.Number)rv).getNumber().toString());
		} else if(ConsistentDataType.Integer.class.isAssignableFrom(rc)) {
			sb.append(((ConsistentDataType.Integer)rv).getL0ng().toString());
		} else if($pkg1_base.$prv_ver_str.core.Clazz.Integer.class.isAssignableFrom(rc)) {
			sb.append((($pkg1_base.$prv_ver_str.core.Clazz.Integer)rv).getL0ng().toString());
		} else if(ConsistentDataType.Float.class.isAssignableFrom(rc)) {
			sb.append(((ConsistentDataType.Float)rv).getD0uble().toString());
		} else if($pkg1_base.$prv_ver_str.core.Clazz.Float.class.isAssignableFrom(rc)) {
			sb.append((($pkg1_base.$prv_ver_str.core.Clazz.Float)rv).getD0uble().toString());
		} else {
			return null;
		}

		return sb.toString();
	}
EoS
print FOUT << 'EoS';

	private static final Pattern jsonEscpPt = Pattern.compile("(\"|\\\\|/|\b|\f|\n|\r|\t"
			+ "|\\x00|\\x01|\\x02|\\x03|\\x04|\\x05|\\x06|\\x07|\\x11|\\x0e|\\x0f"
			+ "|\\x10|\\x11|\\x12|\\x13|\\x14|\\x15|\\x16|\\x17"
			+ "|\\x18|\\x19|\\x1a|\\x1b|\\x1c|\\x1d|\\x1e|\\x1f)");
	private static final Map<String, String> JSON_ESCAPE_CHARS = new HashMap<String, String>();
	static {
		JSON_ESCAPE_CHARS.put("\"", "\\\\\"");
		JSON_ESCAPE_CHARS.put("\\", "\\\\\\\\");
		JSON_ESCAPE_CHARS.put("/", "\\\\/");
		JSON_ESCAPE_CHARS.put("\b", "\\\\b");
		JSON_ESCAPE_CHARS.put("\f", "\\\\f");
		JSON_ESCAPE_CHARS.put("\n", "\\\\n");
		JSON_ESCAPE_CHARS.put("\r", "\\\\r");
		JSON_ESCAPE_CHARS.put("\t", "\\\\t");
		for(char ch = 0; ch <= 0x1f; ch++) {
			if(!JSON_ESCAPE_CHARS.containsKey("" + ch)) {
				JSON_ESCAPE_CHARS.put("" + ch, "\\\\u00" + String.format("%02x", (int)ch));
			}
		}
	}

	/**
	 * Escapes a string for JSON value.
	 *
	 * @param str a string to escape
	 * @return the escaped string
	 */
	public static String escapeJson(String str) {
		if(str == null) {
			return "(null)";
		}

		Matcher jsonEscpMc = jsonEscpPt.matcher(str);
		StringBuffer sb = new StringBuffer();
		while(jsonEscpMc.find()) {
			String mcStr = jsonEscpMc.group(1);
			String rpcStr = JSON_ESCAPE_CHARS.get(mcStr);
			jsonEscpMc.appendReplacement(sb, rpcStr);
		}
		jsonEscpMc.appendTail(sb);

		return sb.toString();
	}

}
EoS
close FOUT;

foreach my $type_full (sort keys %type_fulls) {
	my $type_domain_uris = $type_fulls{$type_full};

	foreach my $domain_uri (sort keys %$type_domain_uris) {
		my $domain = $domain_uris->{$domain_uri};

		if (!exists $domain->{this_name}) {
			next;
		} elsif (exists $domain->{'http://schema.org/supersededBy'}) {
			next;
		}

		print FTREE "\n";
		print FTREE "$type_full\n";
		print FTREE "$domain_uri\n";
		if (exists $domain->{all_subclasses}) {
			foreach my $tmp_domain_uri (sort keys %{$domain->{all_subclasses}}) {
				print FTREE " $tmp_domain_uri\n";
			}
		}
	}
}

foreach my $type_full (sort keys %type_fulls) {
	my $type_domain_uris = $type_fulls{$type_full};
	my $imports = {};
	my $extension = '';
	my $type_pkg = '';
	my $type_name = '';
	my $clazz_inners = 0;
	my $has_range = 0;
	my $has_date_time = 0;
	my $has_date = 0;
	my $has_time = 0;
	my $has_class = 0;
	my $has_property = 0;
	my $has_cntn_boolean = 0;
	my $has_cntn_date = 0;
	my $has_cntn_date_time = 0;
	my $has_cntn_float = 0;
	my $has_cntn_integer = 0;
	my $has_cntn_number = 0;
	my $has_cntn_text = 0;
	my $has_cntn_time = 0;
	my $has_cntn_url = 0;
	my $has_nvdt_boolean = 0;
	my $has_nvdt_date = 0;
	my $has_nvdt_date_time = 0;
	my $has_nvdt_float = 0;
	my $has_nvdt_integer = 0;
	my $has_nvdt_number = 0;
	my $has_nvdt_text = 0;
	my $has_nvdt_time = 0;
	my $has_cnss_dt = 0;
	my $has_type = 0;
	my $type_value = 1;

	foreach my $domain_uri (sort keys %$type_domain_uris) {
		print "$domain_uri\n";
		my $domain = $domain_uris->{$domain_uri};

		if (!exists $domain->{this_name}) {
			next;
		} elsif (exists $domain->{'http://schema.org/supersededBy'}) {
			next;
		}
		print Dumper $domain;
		$extension = $domain->{extension};
		$type_pkg = $domain->{this_pkg};
		$type_name = $type_domain_uris->{$domain_uri};
		# if (exists $type2uris{"$domain->{this_pkg}.$domain->{this_name}"}) {
		#	if ($type_name eq 'Clazz') {
		#		next;
		#	}
		# }

		# importを重複なしで
		my $has_impl_type = 0;
		$clazz_inners = $type_fulls{"$type_pkg.Clazz"};
		if (exists $domain->{super_uris}) {
			my $super_uris = $domain->{super_uris};
			foreach my $super_uri (sort keys %$super_uris) {
				my $s_domain = '';
				if (exists $domain_uris->{$super_uri}) {
					$s_domain = $domain_uris->{$super_uri};
				} else {
					if ($super_uri =~ /^(.+\/\/)([a-z0-9\-\.]*)(schema\.org\/\w+)$/) {
						my $tmp_uri = $1 . $3;
						if (exists $domain_uris->{$tmp_uri}) {
							$s_domain = $domain_uris->{$tmp_uri};
						}
					}
				}
				if ($s_domain eq '') {
					print "couldn't find $super_uri in \$domain_uris\n";
					die;
				}
				my $s_domain_type_full = $s_domain->{type_pri};
				my $s_domain_full = $s_domain_type_full . '.' . $s_domain->{this_name};
				my $s_domain_type_name = $type2names{$s_domain_type_full};
				if (!defined ($s_domain_type_full) || !exists $s_domain->{this_name}) {
					print Dumper $s_domain;
				}
				if ($type_pkg eq $s_domain->{this_pkg}
						&& (($type_name eq 'Container' && $s_domain_type_name eq 'Clazz')
							|| ($type_name eq 'Clazz' && $s_domain_type_name eq 'Container'))) {
					if ($type_full ne $s_domain_type_full) {
						$imports->{$s_domain_type_full} = 1;
					}
				} else {
					if ($type_full ne $s_domain_type_full) {
						if ($s_domain->{this_name} ne 'Number') {
							# [個別対応] Numberのネイティブ型はBigDecimalにしたので継承の問題を回避する
							$imports->{$s_domain_full} = 1;
						}
						$has_impl_type = 1;
					}
				}

				if ($s_domain_type_name eq 'Clazz') {
					$has_class = 1;
					$has_impl_type = 1;
				} elsif ($s_domain_type_name eq 'Container') {
					$has_property = 1;
					$has_impl_type = 1;
				}
			}
			if (!$has_impl_type) {
				$has_type = 1;
			}
		}

		print FRNG "$domain->{type_pri}" . '$' . "$domain->{this_name}\n";
		if (exists $domain->{'http://schema.org/rangeIncludes'}) {
			my $rng_incs = $domain->{'http://schema.org/rangeIncludes'};
			if (keys %$rng_incs > 0) {
				$has_range = 1;
			}

			# rangeIncludesのサブクラスも加える（プロパティが大量に増える）
			my $rng_incs2 = $rng_incs;
			foreach my $rng_inc2 (sort keys %$rng_incs2) {
				if (exists $domain_uris->{$rng_inc2}) {
					my $ri_domain = $domain_uris->{$rng_inc2};
					print FRNG "\t$ri_domain->{type_pri}" . '$' . "$ri_domain->{this_name}\n";
					if ($ri_domain->{this_name} eq 'QualitativeValue') {
						# 無関係の値ばかりになるので除外
						next;
					} elsif ($ri_domain->{this_name} eq 'Text') {
						next;
					}
					if (exists $ri_domain->{all_subclasses}) {
						foreach my $ri_uri (sort keys %{$ri_domain->{all_subclasses}}) {
							my $ri_domain_sub = $domain_uris->{$ri_uri};
							unless (exists $flt_defs{$ri_domain_sub->{type_pri} . '$' . $ri_domain_sub->{this_name}}) {
								# Thing下全ては多いので絞る
								next;
							}
							print FRNG "\t\t$ri_domain_sub->{type_pri}" . '$' . "$ri_domain_sub->{this_name}\n";
							$rng_incs->{$ri_uri} = 1;
						}
					}
				}
			}

			# rangeIncludesで名称が被らないことを保証
			foreach my $rng_inc (sort keys %$rng_incs) {
				if (!exists $domain_uris->{$rng_inc}) {
					print "incprop $rng_inc not exists.\n";
					die Dumper $domain;
				}
				# [個別対応] ContactPointとOrganizationに重複があるが無意味だと思う
				my $p_domain = $domain_uris->{$rng_inc};
				if (exists $p_domain->{'http://schema.org/supersededBy'}) {
					next;
				}
				my $p_domain_type_full = $p_domain->{type_pri};
				my $p_domain_full = $p_domain_type_full . '.' . $p_domain->{this_name};
				my $p_domain_type_name = $type2names{$p_domain_type_full};
				if ($type_pkg eq $p_domain->{this_pkg}
						&& (($type_name eq 'Container' && $p_domain_type_name eq 'Clazz')
							|| ($type_name eq 'Clazz' && $p_domain_type_name eq 'Container')
							|| ($type_name eq 'Container' && $p_domain_type_name eq 'DataType'))) {
					if ($type_full ne $p_domain_type_full) {
						$imports->{$p_domain_type_full} = 1;
					}
				} else {
					if ($type_full ne $p_domain_type_full) {
						$imports->{$p_domain_full} = 1;
					}
				}
			}

			if ($type_name eq 'Clazz') {
				if (keys %$rng_incs > 0) {
					print "class contains rangeIncludes.\n";
					die Dumper $domain;
				}
			} elsif ($type_name ne 'Container') {
				if (keys %$rng_incs > 0) {
					print "normal type contains rangeIncludes.\n";
					die Dumper $domain;
				}
			}
		}
		print FRNG "\n";

		# domainIncludesで名称が被らないことを保証
		print FDMN "$domain->{type_pri}" . '$' . "$domain->{this_name}\n";
		if (exists $domain->{'http://schema.org/domainIncludes'}) {
			my $dom_incs = $domain->{'http://schema.org/domainIncludes'};
			foreach my $dom_inc (sort keys %$dom_incs) {
				if (!exists $domain_uris->{$dom_inc}) {
					print "incprop $dom_inc not exists.\n";
					die Dumper $domain;
				}
				my $p_domain = $domain_uris->{$dom_inc};
				if (exists $p_domain->{'http://schema.org/supersededBy'}) {
					next;
				}
				print FDMN "\t$p_domain->{type_pri}" . '$' . "$p_domain->{this_name}\n";

				my $p_domain_type_full = $p_domain->{type_pri};
				my $p_domain_full = $p_domain_type_full . '.' . $p_domain->{this_name};
				my $p_domain_type_name = $type2names{$p_domain_type_full};
				if ($type_pkg eq $p_domain->{this_pkg}
						&& (($type_name eq 'Container' && $p_domain_type_name eq 'Clazz')
							|| ($type_name eq 'Clazz' && $p_domain_type_name eq 'Container')
							|| ($type_name eq 'Container' && $p_domain_type_name eq 'DataType'))) {
					if ($type_full ne $p_domain_type_full) {
						$imports->{$p_domain_type_full} = 1;
					}
				} else {
					if ($type_full ne $p_domain_type_full) {
						$imports->{$p_domain_full} = 1;
					}
				}
				print "p_domain_type_full: $p_domain_type_full\n";
				print "p_domain_full: $p_domain_full\n";
				print "p_domain_type_name: $p_domain_type_name\n";
			}

			# print "type_name: $type_name\n";
			if ($type_name eq 'Container') {
				if (keys %$dom_incs > 0) {
					print "property contains domainIncludes.\n";
					die Dumper $domain;
				}
			} elsif ($type_name ne 'Clazz') {
				if (keys %$dom_incs > 0) {
					print "nomal type contains domainIncludes.\n";
					die Dumper $domain;
				}
			}
		}
		print FDMN "\n";

		if ($domain->{this_name} eq 'DateTime') {
			$has_date_time = 1;
		}
		if ($domain->{this_name} eq 'Date') {
			$has_date = 1;
		}
		if ($domain->{this_name} eq 'Time') {
			$has_time = 1;
		}
	}

	my $type_domain = 0;
	my $has_type_s_domain = 0;
	if ($type_name ne 'Clazz' && $type_name ne 'Container'
			&& exists $clazz_inners->{$type2uris{$type_full}}) {
		# $imports->{"$type_pkg.Clazz"} = 1;
		$has_type_s_domain = 1;
	} elsif (exists $type2uris{$type_full}
			&& $type2uris{$type_full} =~ /\/\/[a-z0-9\-\.]*schema\.org\/\w+$/) {
		$type_domain = $domain_uris->{$type2uris{$type_full}};
		if (exists $type_domain->{super_uris}) {
			my $super_uris = $type_domain->{super_uris};
			foreach my $super_uri (sort keys %$super_uris) {
				my $s_domain = '';
				if (exists $domain_uris->{$super_uri}) {
					$s_domain = $domain_uris->{$super_uri};
				} else {
					if ($super_uri =~ /^(.+\/\/)([a-z0-9\-\.]*)(schema\.org\/\w+)$/) {
						my $tmp_uri = $1 . $3;
						if (exists $domain_uris->{$tmp_uri}) {
							$s_domain = $domain_uris->{$tmp_uri};
						}
					}
				}
				if ($s_domain eq '') {
					print "couldn't find $super_uri in \$domain_uris\n";
					die;
				}
				my $s_domain_type_full = $s_domain->{type_pri};
				my $s_domain_full = $s_domain_type_full . '.' . $s_domain->{this_name};
				if (!defined ($s_domain_type_full) || !exists $s_domain->{this_name}) {
					print Dumper $s_domain;
				}
				if ($type_full ne $s_domain_full) {
					$imports->{$s_domain_full} = 1;
					$has_type_s_domain = 1;
				}
			}
		}
	}

	if ($type_name eq 'Clazz') {
		$has_class = 1;
	} elsif ($type_name eq 'Container') {
		$has_property = 1;
	} elsif (!$has_type_s_domain) {
		$has_type = 1;
	}

	if ($has_class) {
		$imports->{$pkg1_base . '.SchemaOrgClass'} = 1;
	}
	if ($has_property) {
		$imports->{$pkg1_base . '.SchemaOrgProperty'} = 1;
	}
	if ($has_type) {
		$imports->{$pkg1_base . '.SchemaOrgType'} = 1;
	}
	$imports->{$pkg1_base . '.JsonLdContext'} = 1;
	$imports->{$pkg1_base . '.SchemaOrgURI'} = 1;
	$imports->{$pkg1_base . '.SchemaOrgLabel'} = 1;
	$imports->{$pkg1_base . '.SchemaOrgComment'} = 1;
	$imports->{$pkg1_base . '.CamelizedName'} = 1;
	$imports->{$pkg1_base . '.ConstantizedName'} = 1;
	if ($type_name ne 'Clazz' && $type_name ne 'Container') {
		$imports->{$pkg1_base . '.SampleValue'} = 1;
	}

	# [個別対応]
	if ($extension eq 'pending' && $type_name eq 'Clazz') {
		# 継承元と被るのでインポートせず直接指定
		# delete $imports->{$pkg2_base . '.core.Container.ContactPoint'};
	} elsif ($extension eq 'pending' && $type_name eq 'Container') {
		# 同名クラスのため直接指定
		delete $imports->{$pkg2_base . '.core.Clazz.Duration'};
	} elsif (($extension eq 'bib' && $type_name eq 'Clazz')
			|| ($extension eq 'core' && $type_name eq 'Clazz')) {
		# 継承元に同じメソッドがあるので追加しない
		delete $imports->{$pkg2_base . '.pending.Container.Duration'};
	} elsif ($extension eq 'healthLifesci' && $type_name eq 'MedicalSpecialty') {
		# 継承元から見えるのでインポート不要
		# delete $imports->{$pkg2_base . '.healthLifesci.Clazz.MedicalBusiness'};
		# delete $imports->{$pkg2_base . '.healthLifesci.Clazz.MedicalTherapy'};
	} elsif ($extension eq 'healthLifesci' && $type_name eq 'Container') {
		# 同名クラスのため直接指定
		delete $imports->{$pkg2_base . '.core.Clazz.Action'};
	}

	eval {
		mkpath $out2_dpath . $extension;
	};
	$out_fpath = $out2_dpath . $extension . '/' . $type_name . '.java';
	open (FOUT, '>' . $out_fpath) or die "can't open $out_fpath: $!";
	binmode (FOUT, ':utf8');

	my $buf1 = '';
	my $extd_str = '';
	my %extd_names = ();
	if ($type_name ne 'Clazz' && $type_name ne 'Container'
			&& exists $clazz_inners->{$type2uris{$type_full}}) {
		$extd_names{"Clazz.$type_name"} = 1;
	}
	if ($type_domain) {
		if (exists $type_domain->{super_uris}) {
			my $super_uris = $type_domain->{super_uris};
			foreach my $super_uri (sort keys %$super_uris) {
				my $s_domain = $domain_uris->{$super_uri};
				$extd_names{$s_domain->{this_name}} = 1;
			}
		}
	}
	if ($type_name eq 'Clazz') {
		$extd_names{'SchemaOrgClass'} = 1;
	} elsif ($type_name eq 'Container') {
		$extd_names{'SchemaOrgProperty'} = 1;
	} elsif (keys %extd_names == 0) {
		$extd_names{'SchemaOrgType'} = 1;
	}
	if (keys %extd_names > 0) {
		$extd_str = ' extends ' . join (', ', sort keys %extd_names);
	}

	if ($type2uris{$type_full} =~ /\/\/kyojo\.org\/schemaSpl\//) {
		$buf1 .= '@JsonLdContext("http://kyojo.org/schemaSpl")' . "\n";
	} else {
		$buf1 .= '@JsonLdContext("http://schema.org")' . "\n";
	}
	$buf1 .= '@SchemaOrgURI("' . "$type2uris{$type_full}\")\n";
	if ($type_domain) {
		if (!exists $type_domain->{'http://www.w3.org/2000/01/rdf-schema#label'}) {
			print "no label\n";
			die Dumper $type_domain;
		}
		my $label = $type_domain->{'http://www.w3.org/2000/01/rdf-schema#label'};
		$buf1 .= '@SchemaOrgLabel("' . "$label\")\n";
		if (!exists $type_domain->{'http://www.w3.org/2000/01/rdf-schema#comment'}) {
			print "no comment\n";
			die Dumper $type_domain;
		}
		my $comment = $type_domain->{'http://www.w3.org/2000/01/rdf-schema#comment'};
		$comment =~ s/\\/\\\\/g;
		$comment =~ s/"/\\"/g;
		$comment =~ s/\r/\\r/g;
		$comment =~ s/\n/\\n/g;
		my @cmnt_lns = str2ar ($comment);
		if (@cmnt_lns == 1 && length ($cmnt_lns[0]) < 40) {
			$buf1 .= '@SchemaOrgComment("' . "$cmnt_lns[0]\")\n";
		} else {
			$buf1 .= '@SchemaOrgComment(""' . "\n";
			for (my $li = 0; $li < @cmnt_lns; $li++) {
				my $tl = $li < @cmnt_lns - 1 ? '' : ')';
				$buf1 .= "		+ \"$cmnt_lns[$li]\"$tl\n";
			}
		}
	}
	my $cml_name = camelize2 (tableize2 ($type_name), $type_name);
	$buf1 .= '@CamelizedName("' . "$cml_name\")\n";
	my $cst_name = constantize2 ($type_name);
	$buf1 .= '@ConstantizedName("' . "$cst_name\")\n";
	$buf1 .= "public interface $type_name$extd_str {\n";
	$buf1 .= "\n";
	if ($type_name ne 'Clazz' && $type_name ne 'Container') {
		$buf1 .= "	public String value();\n";
		$buf1 .= "\n";
	}

	if (length $type_name <= 4 || $type_name =~ /[A-Z]{2,}/ || $type_name =~ /(?:id|api|pos|uri|url)/i) {
		print FABB "uri: $type2uris{$type_full}\n";
		if ($type_domain) {
			my $label = $type_domain->{'http://www.w3.org/2000/01/rdf-schema#label'};
			print FABB "label: $label\n";
		}
		print FABB "camel: $cml_name\n";
		print FABB "const: $cst_name\n";
		print FABB "\n";
	}

	foreach my $domain_uri (sort { $domain_uris->{$a}->{this_name} cmp $domain_uris->{$b}->{this_name} } keys %$type_domain_uris) {
		print "$domain_uri\n";
		my $domain = $domain_uris->{$domain_uri};

		if (!exists $domain->{this_name}) {
			next;
		} elsif (exists $domain->{'http://schema.org/supersededBy'}) {
			next;
		# } elsif (exists $type2uris{"$domain->{this_pkg}.$domain->{this_name}"}) {
		#	if ($type_name eq 'Clazz') {
		#		next;
		#	}
		}
		print Dumper $domain;

		$extd_str = '';
		%extd_names = ();
		my $buf2 = '';
		my $list_native_type = '';
		my $list_native_pkg = '';
		if (exists $domain->{'http://schema.org/rangeIncludes'}) {
			my $rng_incs = $domain->{'http://schema.org/rangeIncludes'};
			my @rng_inc_keys = sort keys %$rng_incs;
			foreach my $rng_inc (@rng_inc_keys) {
				my $p_domain = $domain_uris->{$rng_inc};
				if (exists $p_domain->{'http://schema.org/supersededBy'}) {
					next;
				}
				my $p_domain_type_full = $p_domain->{type_pri};
				my $p_domain_full = $p_domain_type_full . '.' . $p_domain->{this_name};
				my $p_domain_type_name = $type2names{$p_domain_type_full};
				my $pre = '';
				if ($type_pkg eq $p_domain->{this_pkg}) {
					if ($type_name eq 'Container' && $p_domain_type_name eq 'Clazz') {
						$pre = 'Clazz.';

						if ($p_domain->{this_name} eq 'Integer') {
							$extd_names{'ContainerInteger'} = 1;
							$has_cntn_integer = 1;
						} elsif ($p_domain->{this_name} eq 'Float') {
							$extd_names{'ContainerFloat'} = 1;
							$has_cntn_float = 1;
						} elsif ($p_domain->{this_name} eq 'URL') {
							$extd_names{'ContainerURL'} = 1;
							$has_cntn_url = 1;
						}
					} elsif ($type_name eq 'Clazz' && $p_domain_type_name eq 'Container') {
						$pre = 'Container.';
					} elsif ($type_name eq 'Container' && $p_domain_type_name eq 'DataType') {
						$pre = 'DataType.';

						if ($p_domain->{this_name} eq 'Boolean') {
							$extd_names{'ContainerBoolean'} = 1;
							$has_cntn_boolean = 1;
						} elsif ($p_domain->{this_name} eq 'Date') {
							$extd_names{'ContainerDate'} = 1;
							$has_cntn_date = 1;
						} elsif ($p_domain->{this_name} eq 'DateTime') {
							$extd_names{'ContainerDateTime'} = 1;
							$has_cntn_date_time = 1;
						} elsif ($p_domain->{this_name} eq 'Number') {
							$extd_names{'ContainerNumber'} = 1;
							$has_cntn_number = 1;
						} elsif ($p_domain->{this_name} eq 'Text') {
							$extd_names{'ContainerText'} = 1;
							$has_cntn_text = 1;
						} elsif ($p_domain->{this_name} eq 'Time') {
							$extd_names{'ContainerTime'} = 1;
							$has_cntn_time = 1;
						}
					}
				}

				my $var_name = camelize2 (tableize2 ($p_domain->{this_name}), $p_domain->{this_name});
				if ($var_name eq 'boolean') {
					$var_name = 'b00lean';
				} elsif ($var_name eq 'class') {
					$var_name = 'clazz';
				} elsif ($var_name eq 'double') {
					$var_name = 'd0uble';
				} elsif ($var_name eq 'long') {
					$var_name = 'l0ng';
				} elsif ($var_name eq 'float') {
					$var_name = 'fl0at';
				}
				my $msd_name = $p_domain->{this_name};
				if ($msd_name eq 'Boolean') {
					$msd_name = 'B00lean';
				} elsif ($msd_name eq 'Class') {
					$msd_name = 'Clazz';
				} elsif ($msd_name eq 'Double') {
					$msd_name = 'D0uble';
				} elsif ($msd_name eq 'Long') {
					$msd_name = 'L0ng';
				} elsif ($msd_name eq 'Float') {
					$msd_name = 'Fl0at';
				}

				# [個別対応] core.Clazz.Duration と pending.Container.Duration が同名
				if ($extension eq 'pending' && $msd_name eq 'Duration') {
					$pre = $pkg2_base . '.core.Clazz.';
				}

				# [個別対応] https://schema.org/Action と https://health-lifesci.schema.org/action が同名
				if ($extension eq 'healthLifesci' && $msd_name eq 'Action') {
					$pre = $pkg2_base . '.core.Clazz.';
				}

				$buf2 .= "		/**\n";
				$buf2 .= "		 * \@see <a href=\"$rng_inc\">$rng_inc</a>\n";
				$buf2 .= "		 */\n";
				$buf2 .= "		public $pre$p_domain->{this_name} get${msd_name}();\n";
				$buf2 .= "		public void set${msd_name}($pre$p_domain->{this_name} ${var_name});\n";
				$buf2 .= "		public List<$pre$p_domain->{this_name}> get${msd_name}List();\n";
				$buf2 .= "		public void set${msd_name}List(List<$pre$p_domain->{this_name}> ${var_name}List);\n";
				$buf2 .= "		public boolean has${msd_name}();\n";
				$buf2 .= "\n";
			}

			# getNativeValueに採用する型の順番にsort
			@rng_inc_keys = sort {
					my $pda = $domain_uris->{$a};
					my $pdb = $domain_uris->{$b};
					my $vna = camelize2 (tableize2 ($pda->{this_name}), $pda->{this_name});
					my $vnb = camelize2 (tableize2 ($pdb->{this_name}), $pdb->{this_name});
					# print "sort: $pda,$pdb,$vna,$vnb\n";
					-($a =~ /\/Text$/) || $b =~ /\/Text$/ ||
					-($a =~ /\/URL$/) || $b =~ /\/URL$/ ||
					-($a =~ /\/DateTime$/) || $b =~ /\/DateTime$/ ||
					-($a =~ /\/Date$/) || $b =~ /\/Date$/ ||
					-($a =~ /\/Time$/) || $b =~ /\/Time$/ ||
					-($a =~ /\/Number$/) || $b =~ /\/Number$/ ||
					-($a =~ /\/Float$/) || $b =~ /\/Float$/ ||
					-($a =~ /\/Integer$/) || $b =~ /\/Integer$/ ||
					-($a =~ /\/Boolean$/) || $b =~ /\/Boolean$/ || $a cmp $b;
				} @rng_inc_keys;
			foreach my $rng_inc (@rng_inc_keys) {
				my $p_domain = $domain_uris->{$rng_inc};
				if (exists $p_domain->{'http://schema.org/supersededBy'}) {
					next;
				}
				my $var_name = camelize2 (tableize2 ($p_domain->{this_name}), $p_domain->{this_name});
				if ($var_name eq 'boolean') {
					$var_name = 'b00lean';
				} elsif ($var_name eq 'class') {
					$var_name = 'clazz';
				}

				if ($var_name eq 'text' || $var_name eq 'url') {
					$list_native_type = 'String';
					$list_native_pkg = '';
					$extd_names{'NativeValueText'} = 1;
					$has_nvdt_text = 1;
				} elsif ($var_name eq 'dateTime') {
					$list_native_type = 'Date';
					$list_native_pkg = 'java.util.';
					$extd_names{'NativeValueDateTime'} = 1;
					$has_nvdt_date_time = 1;
				} elsif ($var_name eq 'date') {
					$list_native_type = 'Date';
					$list_native_pkg = 'java.util.';
					$extd_names{'NativeValueDate'} = 1;
					$has_nvdt_date = 1;
				} elsif ($var_name eq 'time') {
					$list_native_type = 'Date';
					$list_native_pkg = 'java.util.';
					$extd_names{'NativeValueTime'} = 1;
					$has_nvdt_time = 1;
				} elsif ($var_name eq 'integer') {
					$list_native_type = 'Long';
					$list_native_pkg = '';
					$extd_names{'NativeValueInteger'} = 1;
					$has_nvdt_integer = 1;
				} elsif ($var_name eq 'float') {
					$list_native_type = 'Double';
					$list_native_pkg = '';
					$extd_names{'NativeValueFloat'} = 1;
					$has_nvdt_float = 1;
				} elsif ($var_name eq 'number') {
					$list_native_type = 'BigDecimal';
					$list_native_pkg = 'java.math.';
					$extd_names{'NativeValueNumber'} = 1;
					$has_nvdt_number = 1;
				} elsif ($var_name eq 'b00lean') {
					$list_native_type = 'Boolean';
					$list_native_pkg = 'java.lang.';
					$extd_names{'NativeValueBoolean'} = 1;
					$has_nvdt_boolean = 1;
				} else {
					$list_native_type = 'String';
					$list_native_pkg = '';
					$extd_names{'NativeValueText'} = 1;
					$has_nvdt_text = 1;
				}
				print "var_name=$var_name, list_native_type=$list_native_type\n";
				last;
			}

			print "this_name=$domain->{this_name}, list_native_type=$list_native_type\n";
		}

		if ($domain->{this_name} eq 'Value') {
			# exit;
		}

		if (exists $domain->{'http://schema.org/domainIncludes'}) {
			my $dom_incs = $domain->{'http://schema.org/domainIncludes'};
			foreach my $dom_inc (sort { $domain_uris->{$a}->{this_name} cmp $domain_uris->{$b}->{this_name} } keys %$dom_incs) {
				my $p_domain = $domain_uris->{$dom_inc};
				if (exists $p_domain->{'http://schema.org/supersededBy'}) {
					next;
				}
				my $p_domain_type_full = $p_domain->{type_pri};
				my $p_domain_full = $p_domain_type_full . '.' . $p_domain->{this_name};
				my $p_domain_type_name = $type2names{$p_domain_type_full};
				my $pre = '';
				if ($type_pkg eq $p_domain->{this_pkg}) {
					if ($type_name eq 'Container' && $p_domain_type_name eq 'Clazz') {
						$pre = 'Clazz.';
					} elsif ($type_name eq 'Clazz' && $p_domain_type_name eq 'Container') {
						$pre = 'Container.';
					} elsif ($type_name eq 'Container' && $p_domain_type_name eq 'DataType') {
						$pre = 'DataType.';
					}
				}

				# [個別対応]
				if ($extension eq 'core' && $type_name eq 'Clazz'
						&& $domain->{this_name} eq 'Physician'
						&& $p_domain->{this_name} eq 'MedicalSpecialty') {
					# クラス検索で継承元のものが先に見えてしまうので直接指定
					# $pre = $pkg2_base . '.healthLifesci.Container.';
				} elsif ($extension eq 'pending' && $type_name eq 'Clazz'
						&& $domain->{this_name} eq 'HealthInsurancePlan'
						&& $p_domain->{this_name} eq 'ContactPoint') {
					# クラス検索で継承元のものが先に見えてしまうので直接指定
					# $pre = $pkg2_base . '.core.Container.';
				} elsif ($extension eq 'bib' && $type_name eq 'Clazz'
						&& $domain->{this_name} eq 'Audiobook'
						&& $p_domain->{this_name} eq 'Duration') {
					# 継承元に同じメソッドがあるので追加しない
					next;
				}

				# [個別対応] core.Clazz.Duration と pending.Container.Duration が同名
				if ($extension eq 'core' && $p_domain->{this_name} eq 'Duration') {
					$pre = $pkg2_base . '.pending.Container.';
				}

				my $var_name = camelize2 (tableize2 ($p_domain->{this_name}), $p_domain->{this_name});
				$buf2 .= "		/**\n";
				$buf2 .= "		 * \@see <a href=\"$dom_inc\">$dom_inc</a>\n";
				$buf2 .= "		 */\n";
				$buf2 .= "		public $pre$p_domain->{this_name} get$p_domain->{this_name}();\n";
				$buf2 .= "		public void set$p_domain->{this_name}($pre$p_domain->{this_name} $var_name);\n";
				$buf2 .= "\n";
			}
		}

		if ($list_native_type ne '') {
			$buf2 .= "		public $list_native_pkg$list_native_type getNativeValue();\n";
			$buf2 .= "\n";
		} else {
			if ($type_name eq 'DataType') {
				if ($domain->{this_name} eq 'Boolean') {
					$buf2 .= "		public java.lang.Boolean getB00lean();\n";
					$buf2 .= "		public void setB00lean(java.lang.Boolean b00lean);\n";
					$buf2 .= "		public java.lang.Boolean getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Boolean'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueBoolean'} = 1;
					$has_nvdt_boolean = 1;
				} elsif ($domain->{this_name} eq 'DateTime') {
					$buf2 .= "		public OffsetDateTime getDateTime();\n";
					$buf2 .= "		public void setDateTime(OffsetDateTime dateTime);\n";
					$buf2 .= "		public java.util.Date getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.DateTime'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueDateTime'} = 1;
					$has_nvdt_date_time = 1;
				} elsif ($domain->{this_name} eq 'Date') {
					$buf2 .= "		public LocalDate getDate();\n";
					$buf2 .= "		public void setDate(LocalDate date);\n";
					$buf2 .= "		public java.sql.Date getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Date'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueDate'} = 1;
					$has_nvdt_date = 1;
				} elsif ($domain->{this_name} eq 'Time') {
					$buf2 .= "		public LocalTime getTime();\n";
					$buf2 .= "		public void setTime(LocalTime time);\n";
					$buf2 .= "		public java.sql.Time getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Time'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueTime'} = 1;
					$has_nvdt_time = 1;
				} elsif ($domain->{this_name} eq 'Number') {
					$buf2 .= "		public java.math.BigDecimal getNumber();\n";
					$buf2 .= "		public void setNumber(java.math.BigDecimal number);\n";
					$buf2 .= "		public java.math.BigDecimal getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Number'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueNumber'} = 1;
					$has_nvdt_number = 1;
				} elsif ($domain->{this_name} eq 'Text') {
					$buf2 .= "		public String getString();\n";
					$buf2 .= "		public void setString(String string);\n";
					$buf2 .= "		public String getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Text'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueText'} = 1;
					$has_nvdt_text = 1;
				}
			} elsif ($type_name eq 'Clazz') {
				if ($domain->{this_name} eq 'Float') {
					$buf2 .= "		public Double getD0uble();\n";
					$buf2 .= "		public void setD0uble(Double d0uble);\n";
					$buf2 .= "		public Double getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Float'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueFloat'} = 1;
					$has_nvdt_float = 1;
				} elsif ($domain->{this_name} eq 'Integer') {
					$buf2 .= "		public Long getL0ng();\n";
					$buf2 .= "		public void setL0ng(Long l0ng);\n";
					$buf2 .= "		public Long getNativeValue();\n";
					$buf2 .= "\n";
					$extd_names{'ConsistentDataType.Integer'} = 1;
					$has_cnss_dt = 1;
					$extd_names{'NativeValueInteger'} = 1;
					$has_nvdt_integer = 1;
				} else {
					if ($domain->{this_name} ne 'DataType') {
						$buf2 .= "		public String getString();\n";
						$buf2 .= "		public void setString(String string);\n";
						$buf2 .= "		public String getNativeValue();\n";
						$buf2 .= "\n";
						$extd_names{'NativeValueText'} = 1;
						$has_nvdt_text = 1;
					}
				}
			}
		}

		if (exists $domain->{super_uris}) {
			my $super_uris = $domain->{super_uris};
			foreach my $super_uri (sort keys %$super_uris) {
				my $s_domain = '';
				if (exists $domain_uris->{$super_uri}) {
					$s_domain = $domain_uris->{$super_uri};
				} else {
					if ($super_uri =~ /^(.+\/\/)([a-z0-9\-\.]*)(schema\.org\/\w+)$/) {
						my $tmp_uri = $1 . $3;
						if (exists $domain_uris->{$tmp_uri}) {
							$s_domain = $domain_uris->{$tmp_uri};
						}
					}
				}
				if ($s_domain eq '') {
					print "couldn't find $super_uri in \$domain_uris\n";
					die;
				}
				my $s_domain_type_full = $s_domain->{type_pri};
				my $s_domain_full = $s_domain_type_full . '.' . $s_domain->{this_name};
				my $s_domain_type_name = $type2names{$s_domain_type_full};
				print "$super_uri, $s_domain_type_full, $s_domain_full, $s_domain_type_name\n";
				if ($type_pkg eq $s_domain->{this_pkg}) {
					if ($type_name eq 'Container' && $s_domain_type_name eq 'Clazz') {
						$extd_names{'Clazz.' . $s_domain->{this_name}} = 1;
					} elsif ($type_name eq 'Clazz' && $s_domain_type_name eq 'Container') {
						$extd_names{'Container.' . $s_domain->{this_name}} = 1;
					} else {
						if ($s_domain->{this_name} eq 'Number') {
							# [個別対応] Numberのネイティブ型はBigDecimalにしたので継承の問題を回避する
							$extd_names{'DataType'} = 1;
						} else {
							$extd_names{$s_domain->{this_name}} = 1;
						}
					}
				} else {
					$extd_names{$s_domain->{this_name}} = 1;
				}

				if ($s_domain_type_name eq 'Clazz') {
					$extd_names{'SchemaOrgClass'} = 1;
				} elsif ($s_domain_type_name eq 'Container') {
					$extd_names{'SchemaOrgProperty'} = 1;
				}
			}
			if (keys %$super_uris == 0) {
				print "no super_uris.(1)\n";
			}
		} else {
			print "no super_uris.(2)\n";
		}
		if ($type_name eq 'Clazz') {
			$extd_names{'SchemaOrgClass'} = 1;
		} elsif ($type_name eq 'Container') {
			$extd_names{'SchemaOrgProperty'} = 1;
		} else {
			$extd_names{$type_name} = 1;
		}
		# [個別対応] typeが複数
		# 上で追加しなかったほうをextend →変更
		# if ($domain_uri eq 'http://schema.org/Radiography') {
		#	$extd_names{'MedicalImagingTechnique'} = 1;
		# }
		# 別々に宣言して同じextendsにする
		if ($domain_uri eq 'http://schema.org/Radiography') {
			$extd_names{'MedicalSpecialty'} = 1;
			$extd_names{'MedicalImagingTechnique'} = 1;
		}
		$extd_str = ' extends ' . join (', ', sort keys %extd_names);

		$buf1 .= '	@JsonLdContext("http://schema.org")' . "\n";
		$buf1 .= '	@SchemaOrgURI("' . "$domain_uri\")\n";
		if (!exists $domain->{'http://www.w3.org/2000/01/rdf-schema#label'}) {
			print "no label\n";
			die Dumper $domain;
		}
		my $label = $domain->{'http://www.w3.org/2000/01/rdf-schema#label'};
		$buf1 .= '	@SchemaOrgLabel("' . "$label\")\n";
		if (!exists $domain->{'http://www.w3.org/2000/01/rdf-schema#comment'}) {
			print "no comment\n";
			die Dumper $domain;
		}
		my $comment = $domain->{'http://www.w3.org/2000/01/rdf-schema#comment'};
		$comment =~ s/\\/\\\\/g;
		$comment =~ s/"/\\"/g;
		$comment =~ s/\r/\\r/g;
		$comment =~ s/\n/\\n/g;
		my @cmnt_lns = str2ar ($comment);
		if (@cmnt_lns == 1 && length ($cmnt_lns[0]) < 40) {
			$buf1 .= '	@SchemaOrgComment("' . "$cmnt_lns[0]\")\n";
		} else {
			$buf1 .= '	@SchemaOrgComment(""' . "\n";
			for (my $li = 0; $li < @cmnt_lns; $li++) {
				my $tl = $li < @cmnt_lns - 1 ? '' : ')';
				$buf1 .= "			+ \"$cmnt_lns[$li]\"$tl\n";
			}
		}
		$cml_name = camelize2 (tableize2 ($domain->{this_name}), $domain->{this_name});
		$buf1 .= '	@CamelizedName("' . "$cml_name\")\n";
		$cst_name = constantize2 ($domain->{this_name});
		$buf1 .= '	@ConstantizedName("' . "$cst_name\")\n";
		if ($type_name ne 'Clazz' && $type_name ne 'Container') {
			my $key = "$extension\t$type_name\t$domain->{this_name}";
			if (exists $type_value_defs{$key}) {
				$buf1 .= '	@SampleValue("' . $type_value_defs{$key} . "\")\n";
				print FTPO "$extension\t$type_name\t$domain->{this_name}\t$type_value_defs{$key}\n";
			} else {
				$buf1 .= '	@SampleValue("' . $type_value . "\")\n";
				print FTPO "$extension\t$type_name\t$domain->{this_name}\t$type_value\n";
			}
		}
		$buf1 .= "	public interface $domain->{this_name}$extd_str {\n";
		$buf1 .= "\n";

		$buf1 .= $buf2;

		$buf1 .= "	}\n";
		$buf1 .= "\n";

		if (length $label <= 4 || $label =~ /[A-Z]{2,}/ || $label =~ /(?:id|api|pos|uri|url)/i) {
			print FABB "uri: $domain_uri\n";
			print FABB "label: $label\n";
			print FABB "camel: $cml_name\n";
			print FABB "const: $cst_name\n";
			print FABB "\n";
		}

		$type_value++;
	}

	print FOUT "package $type_pkg;\n";
	print FOUT "\n";
	if ($has_date) {
		print FOUT "import java.time.LocalDate;\n";
	}
	if ($has_time) {
		print FOUT "import java.time.LocalTime;\n";
	}
	if ($has_date_time) {
		print FOUT "import java.time.OffsetDateTime;\n";
	}
	if ($has_range) {
		print FOUT "import java.util.List;\n";
	}
	if ($has_date_time || $has_date || $has_time || $has_range) {
		print FOUT "\n";
	}

	if ($has_cntn_boolean) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerBoolean"} = 1;
	}
	if ($has_cntn_date) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerDate"} = 1;
	}
	if ($has_cntn_date_time) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerDateTime"} = 1;
	}
	if ($has_cntn_float) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerFloat"} = 1;
	}
	if ($has_cntn_integer) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerInteger"} = 1;
	}
	if ($has_cntn_number) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerNumber"} = 1;
	}
	if ($has_cntn_text) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerText"} = 1;
	}
	if ($has_cntn_time) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerTime"} = 1;
	}
	if ($has_cntn_url) {
		$imports->{"$pkg1_base.$cur_ver_str.ContainerURL"} = 1;
	}
	if ($has_nvdt_boolean) {
		$imports->{$pkg1_base . '.NativeValueBoolean'} = 1;
	}
	if ($has_nvdt_date) {
		$imports->{$pkg1_base . '.NativeValueDate'} = 1;
	}
	if ($has_nvdt_date_time) {
		$imports->{$pkg1_base . '.NativeValueDateTime'} = 1;
	}
	if ($has_nvdt_float) {
		$imports->{$pkg1_base . '.NativeValueFloat'} = 1;
	}
	if ($has_nvdt_integer) {
		$imports->{$pkg1_base . '.NativeValueInteger'} = 1;
	}
	if ($has_nvdt_number) {
		$imports->{$pkg1_base . '.NativeValueNumber'} = 1;
	}
	if ($has_nvdt_text) {
		$imports->{$pkg1_base . '.NativeValueText'} = 1;
	}
	if ($has_nvdt_time) {
		$imports->{$pkg1_base . '.NativeValueTime'} = 1;
	}
	if ($has_cnss_dt) {
		$imports->{$pkg1_base . '.ConsistentDataType'} = 1;
	}
	foreach my $import (sort keys %$imports) {
		print FOUT "import $import;\n";
	}
	if (keys %$imports > 0) {
		print FOUT "\n";
	}

	print FOUT $buf1;
	print FOUT "}\n";

	close FOUT;
}

close FWRN;
close FTPO;
close FABB;
close FNTV;
close FSUP;
close FSUB;
close FRNG;
close FDMN;

sub str2ar {
	my $str = shift;
	my $max = 80;

	my @ret = ();
	my $line = '';
	my $is_1st = 1;
	foreach my $word (split (/ /, $str)) {
		my $word2 = $is_1st ? $word : ' ' . $word;
		$is_1st = 0;

		if (length $word2 > $max) {
			if ($line ne '') {
				push (@ret, $line);
			}
			push (@ret, $word2);
			$line = '';
		} elsif (length ($line . $word2) > $max) {
			push (@ret, $line);
			$line = $word2;
		} else {
			$line .= $word2;
		}
	}
	if ($line ne '') {
		push (@ret, $line);
	}

	return @ret;
}

print "completed.\n";

sub tableize {
	my $word = shift;

	return lc (constantize ($word));
}

sub tableize2 {
	my $word = shift;

	return lc (constantize2 ($word));
}

sub pascalize {
	my $word = shift;

	# [個別対応]
	if ($word eq 'latex') {
		return 'LaTeX';
	}

	$word =~ tr/_\-/  /;
	return join ('', map { ucfirst (lc ($_)) } split (/ /, $word));
}

# 大文字が連続する名称
sub pascalize2 {
	my $word = shift;

	# [個別対応]
	if ($word eq 'latex') {
		return 'LaTeX';
	}

	$word =~ tr/_\-/  /;

	my $tl = '';
	if ($word =~ / ([a-z])$/i) {
		$tl = uc $1;
		$word =~ s/ [a-z]$//i;
	}

	return join ('', map { length ($_) > 1 ? ucfirst (lc ($_)) : $_ } split (/ /, $word)) . $tl;
}

sub camelize {
	my $word = shift;

	# [個別対応]
	if ($word eq 'emissions_co2') {
		return 'emissionsCO2';
	} elsif (lc $word eq 'latex' || $word eq 'la_te_x') {
		return 'latex';
	}

	return lcfirst (pascalize ($word));
}

sub camelize2 {
	my $word = shift;
	my $word2 = shift;

	# [個別対応]
	if ($word eq 'emissions_co2') {
		return 'emissionsCO2';
	} elsif (lc $word eq 'latex' || $word eq 'la_te_x') {
		return 'latex';
	}

	my $tl = '';
	my $exp = '(id|api|pos|uri|url)';
	if ($word =~ /_$exp$/i) {
		$word2 =~ /$exp$/i;
		$tl = $1;
		$word =~ s/_$exp$//i;
	}

	return lcfirst (pascalize2 ($word)) . $tl;
}

sub constantize {
	my $word = shift;

	$word =~ s~(?<=\w)([A-Z])~_$1~g;
	return uc ($word);
}

sub constantize2 {
	my $word = shift;

	# [個別対応]
	if ($word eq 'EmissionsCO2') {
		return 'EMISSIONS_CO2';
	} elsif ($word eq 'LaTeX') {
		return 'LATEX';
	}

	my $hd = '';
	my $exp = '(FDA|DDx)';
	if ($word =~ /^$exp/i) {
		$hd = uc ($1) . '_';
		$word =~ s/^$exp//i;
	}

	$word =~ s/([A-Z]+)([A-Z][a-z])/$1_$2/g;
	$word =~ s/([a-z\\d])([A-Z])/$1_$2/g;
	return $hd . uc ($word);
}
